# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## What this project is

Spring Data repositories over the Jakarta Persistence mappings of
[`sqlserver-samples-persistence`](https://github.com/jinahya/sqlserver-samples-persistence), which maps three
Microsoft SQL Server sample databases. A parent-less multi-module project, modelled on the sibling
`postgresql-demodb-spring-data`; the root `pom.xml` is the aggregator and the parent of:

| Module                                                  | Database             | Entities |
|---------------------------------------------------------|----------------------|---------:|
| `sqlserver-samples-spring-data-adventureworks`     | `AdventureWorks`     |       82 |
| `sqlserver-samples-spring-data-futonmanufacturing` | `FutonManufacturing` |       50 |
| `sqlserver-samples-spring-data-wideworldimporters` | `WideWorldImporters` |       34 |

Every version and every plugin configuration lives in the root (`dependencyManagement`, `pluginManagement`, and the
dependencies every module shares). A module's pom declares one dependency: its upstream module,
`io.github.jinahya:sqlserver-samples-persistence-<db>`. Modules do not depend on each other.

In each module (`<db>` is `adventureworks`, `futonmanufacturing` or `wideworldimporters`):

- Entities: `com.github.jinahya.sqlserver.sample.persistence.<db>.<schema>`, **in the module's `src/main`**, one
  package per schema (`sales`, `person`, ...; FutonManufacturing has `dbo` only), each extending a mapped superclass of
  upstream's `...<db>.mapped.<schema>` package.
- Repositories: **the entity's package plus `.data`**, `...<db>.<schema>.data` (`...adventureworks.person.data`), each
  with its own `package-info.java` (`@NullMarked`, JSpecify). One per entity, named `<Entity>Repository`, extending
  `_Repository<E, ID>` (`JpaRepository` + `JpaSpecificationExecutor`, `@NoRepositoryBean`). An entity with an
  `@IdClass` or an `@EmbeddedId` takes upstream's `<Entity>Id` class as its `ID`. The repositories are **empty** for
  now.
- Shared: `_Repository` is in `...<db>.data` (public, so every `<schema>.data` package can extend it), the one
  package of main sources that is neither an entity package nor a repository package.
- **Where two schemas have an entity of the same simple name**, both repositories keep the plain name
  (`...sales.data.CustomerRepository` and `...website.data.CustomerRepository`), and each carries an explicit bean
  name, `@Repository("<schema><Entity>Repository")`: WideWorldImporters' `salesCustomerRepository` /
  `websiteCustomerRepository`, `purchasingSupplierRepository` / `websiteSupplierRepository`,
  `warehouseVehicleTemperatureRepository` / `websiteVehicleTemperatureRepository`. Spring Data names a repository bean
  after its simple name otherwise, so the two would clash in one context; its `RepositoryBeanNameGenerator` honours
  the annotation's value, so a consumer needs no name generator of its own. Inject such a repository by its type, which
  is unique.
- The published jars carry **the entities and the repositories**: `spring-data-jpa`, `jakarta.persistence-api`,
  `jakarta.validation-api` and `jakarta.annotation-api` are `provided`. No Boot starter is named in main.

## Upstream, and the entities

The upstream checkout `../../sqlserver-samples-persistence` publishes, at `0.0.1-SNAPSHOT`, one jar per database of
**mapped superclasses, their `<Entity>Id` id classes, their generated static metamodel, their attribute converters,
`__Constants` and `__Utils`**, all under `...<db>.mapped` (and its schema subpackages). They are **SNAPSHOTs that exist
only locally**: after a change upstream, run `./mvnw -DskipTests install` there before building here. This project
uses no `test-companion` jar of upstream's. Upstream tests each mapping on H2 (`<db>-test`) and on SQL Server
(`<db>-it`); this project has no H2.

- **Upstream keeps its entities in `src/test`**, on purpose: which associations an entity maps, lazy or not, with what
  cascade, is an application's decision, and this project is that application. The entities here are copies of
  upstream's test `@Entity` classes, **verbatim**, at the same path and package
  (`<upstream module>/src/test/java/.../<db>/<schema>/<Entity>.java`). **Keep them in step with upstream**: diff
  against upstream's before touching a mapping, and change the mapping there first.
- **The copies are upstream HEAD's test entities, verbatim, with nothing of this project's own.** A member upstream
  does not have (a named query, a method) is added to a copy only where this project uses it, by a repository method or
  a test, and is named here; there is none so far. Before taking a difference from upstream for an addition of this
  project's, find the upstream commit the copy matches: an old copy carries what upstream had then (the `@Nullable`s
  and javadoc of upstream's c6fbfd6, which the copies carried until they
  were brought to upstream's current ones). What a
  copy needs of upstream's `src/test` besides the entities is copied too, into `src/main/java` in the same package;
  the id classes (`<Entity>Id`) are not, since upstream's main jar has them.
- **Upstream's keyless classes are not copied**: the views with no key, WideWorldImporters' `*_Archive` history tables,
  AdventureWorks' `ProductDocument`. They are plain classes, not entities, and have no repository. Neither are
  upstream's test utilities (`___Persistence_TestUtils`, `_Entity_PersistenceIT`, `*_PersistenceIT`).
- Entity names carry the schema (`@Entity(name = "SalesStore")`), so JPQL names an entity by it (`FROM SalesStore s`).
- Read `../../sqlserver-samples-persistence/README.md` and its `CLAUDE.md` before touching anything about the
  mappings.

## Build

There is no wrapper here; use the Maven on `PATH`. The build JDK must be **25** (enforced): main sources compile at
release 17, as upstream, tests at 25.

```sh
mvn clean verify                                       # compile all modules, run the context tests
mvn -pl sqlserver-samples-spring-data-adventureworks test
mvn -Dtest='*_SpringBootIT' -Dsurefire.failIfNoSpecifiedTests=false test   # integration tests; needs SQL Server
mvn -o enforcer:enforce -Denforcer.rules=dependencyConvergence
```

Surefire's default includes do not match `*IT`, and no failsafe plugin is configured, so `test`/`verify`/`install`
never run the `*_SpringBootIT` classes; run them explicitly with `-Dtest`.

**The integration tests need the sample-databases container** that upstream owns: run
`../../sqlserver-samples-persistence/_compose.sh` (Ctrl-C takes it down again, with its data). It runs
`onacit/mssql-sample-databases:2025-latest` as the container `mssql-sample-databases` on `localhost:1433`, user `sa`,
password `Passw0rd!`, with the three databases loaded on start. Each module's `src/test/resources/application.yaml`
connects to its database there with `ddl-auto: none`, `SQLServerDialect` named outright, and
`PhysicalNamingStrategyStandardImpl` (Boot's default strategy would snake-case `SalesOrderID` into `sales_orderid`).
Never let a test generate DDL against it. A `@SpringBootTest` that runs no query still passes with no database up,
since the dialect is named; only a query proves the connection.

## Load-bearing pom decisions

Each is commented in `pom.xml`:

- **Spring Boot 4.x (`4.1.2`), not 3.x.** Boot 4 manages `jakarta.persistence-api` 3.2, which the upstream mappings are
  written against. Do not downgrade to dodge a problem.
- **`spring-boot-dependencies` is imported, not inherited** (the root pom is parent-less). Every Spring / Boot /
  Hibernate version comes from the BOM; declare those with no `<version>`. A direct `dependencyManagement` entry is only
  for what Boot does not manage. Lombok, the JDBC driver, H2, JUnit, Mockito, AssertJ and Logback are at Boot's
  versions: nothing is imported before Boot's BOM, and no entry pins over it, since a -data project is aligned by its
  platform and the platform is what moves (PROJECTS_VERSIONS.asciidoc of jakarta-persistence-applied-book).
- **`hibernate-processor` is on the processor path** of both compile executions, from the BOM's version, to generate
  the entities' static metamodel (`Store_`, ..., extending upstream's `MappedStore_`).
- **Boot 4 starters come in pairs.** Tests declare `spring-boot-starter-data-jpa-test` and `-validation-test`, not
  `spring-boot-starter-test`, which each of them brings.
- **Dependency convergence is a build defect**, not a warning. Resolve `jakarta.*` at the platform level instead of
  pinning individual API artifacts.
- **Lombok is `provided`** for main and test, on the processor path of both compile executions.

## Tests

Each module's test root package, `...<db>`, has `___Spring_TestContext`: `@SpringBootConfiguration` +
`@EnableAutoConfiguration` + `@EntityScan(basePackageClasses = {...})`, naming one entity of each schema package (so the
scan stays off upstream's `mapped` packages). It is in `<db>`, not in `<db>.data`, because a `@SpringBootTest` finds
its configuration by walking **up** from its own package, and the repository tests are in `<db>.<schema>.data`; being
in `<db>` also makes it the base package Spring Data scans for repositories. It lives in test sources on purpose:
nothing in `src/main` carries a `@SpringBootApplication`. `SpringTestContext_SpringBootTest`, next to it, tests the
context itself (every entity in the metamodel), and is the only test `verify` runs.

Repository tests extend a small hierarchy, per module. The bases are in `...<db>.data`, **public, with protected
members**, because the tests extending them are in the `<schema>.data` packages:

- `__Repository_TestBase<T, U, V>`: repository, entity and id types; injects the repository (`repositoryInstance()`)
  and the `EntityManager` (`entityManager()`); `identifier(entity)` reads an id through the metamodel; `column(..)`,
  `longColumn(..)` read a tuple's columns by alias.
- `_Repository_SpringBootIT`: `@SpringBootTest` against the sample database. Repository calls commit unless the test is
  `@Transactional`. `selectRandom()` / `selectRandomPresent()` pick a row, the latter aborting the test by an
  assumption when the table is empty. It declares no tests yet.
- `<Repository>_SpringBootIT`, one per repository, in its repository's `<schema>.data` package, **empty** for now.
  There is no `_DataJpaTest` and no H2: the tests are ITs only.

A repository test never calls `entityManager()` itself; everything a test does with the database goes through the
repository under test. An integration test **reads the sample data; it never fabricates rows**. A test that must write
does so inside `@Transactional`, so it is rolled back.

Logging is set in each module's `src/test/resources/logback-spring.xml` (`org.hibernate.SQL` at DEBUG,
`org.hibernate.orm.jdbc.bind` at TRACE, the module's root package at DEBUG). Keep levels there, not under
`logging.level` in `application.yaml`, and do not add a `logback.xml` / `logback-test.xml`.

## Style

- Separator comments (`// ---- name`) are padded to column 120, the line length of the code.
- Shell scripts, if any are added, get lower-case, underscore-only names (`_compose.sh`, `_docker_exec_sqlcmd.sh`).
