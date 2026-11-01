# mssql-sample-databases-spring-data

Spring Data repositories for three Microsoft SQL Server sample databases (AdventureWorks, WideWorldImporters and
FutonManufacturing), built on the mapped superclasses of
[mssql-sample-databases-persistence](https://github.com/jinahya/mssql-sample-databases-persistence).

The sibling [mssql-sample-databases-jakarta-data](https://github.com/jinahya/mssql-sample-databases-jakarta-data) is
the same thing in Jakarta Data.

## Modules

One module per sample database, each depending on its upstream module only
(`mssql-sample-databases-persistence-<db>`):

| Module                                                  | Database             | Entities |
|---------------------------------------------------------|----------------------|---------:|
| `mssql-sample-databases-spring-data-adventureworks`     | `AdventureWorks`     |       82 |
| `mssql-sample-databases-spring-data-futonmanufacturing` | `FutonManufacturing` |       50 |
| `mssql-sample-databases-spring-data-wideworldimporters` | `WideWorldImporters` |       34 |

## The entities

Upstream publishes mapped superclasses (`MappedStore`, ...), their id classes (`MappedSalesOrderDetailId`, ...), their
static metamodel and a converter, and keeps its entities in its test sources: which associations to map, and how, is an
application's decision. This project is that application. Each module's entities, in
`com.github.jinahya.mssql.sample.databases.persistence.<db>.<schema>`, one package per schema, are copies of
upstream's test entities, kept in step with them. Upstream's keyless classes (views with no key, the `*_Archive`
history tables, `ProductDocument`) are not entities, and are not copied.

One repository per entity, in `com.github.jinahya.mssql.sample.databases.persistence.<db>.data`, each extending
`_Repository<E, ID>` (`JpaRepository` + `JpaSpecificationExecutor`); an entity with an `@IdClass` takes upstream's id
class as its `ID`. The repositories are empty for now.

## Requirements

* JDK 25 to build (enforced); the published jars target 17, as upstream does
* Maven 3.x; there is no wrapper here
* Spring Boot 4.1.x, Spring Data JPA (`provided`: bring it, and a JPA provider, yourself)

The upstream jars are `0.0.1-SNAPSHOT`s that exist only locally. Install them first:

```sh
(cd ../mssql-sample-databases-persistence && ./mvnw -DskipTests install)
```

## Build

```sh
mvn clean verify            # compiles every module, runs the context tests; no database needed
```

### Integration tests

The `*_SpringBootIT` classes run against the real sample databases and are not run by `verify`/`install`. Start the
container that upstream provides, which serves the three databases on `localhost:1433` as `sa` / `Passw0rd!`, then name
the tests:

```sh
../mssql-sample-databases-persistence/compose.sh                                 # Ctrl-C takes it down
mvn -Dtest='*_SpringBootIT' -Dsurefire.failIfNoSpecifiedTests=false test
mvn -pl mssql-sample-databases-spring-data-adventureworks -Dtest=StoreRepository_SpringBootIT test
```

The tests only read the sample data, and never generate DDL.

## Links

### [Spring Data JPA](https://docs.spring.io/spring-data/jpa/reference/)

* [Defining Query Methods](https://docs.spring.io/spring-data/jpa/reference/repositories/query-methods-details.html)
* [Specifications](https://docs.spring.io/spring-data/jpa/reference/jpa/specifications.html)

### [Microsoft SQL Server sample databases](https://github.com/microsoft/sql-server-samples)
