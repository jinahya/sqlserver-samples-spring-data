/**
 * Spring Data repositories for the entities of the {@code production} schema of AdventureWorks, which live in the
 * parent package {@code com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production}: this module's
 * own entities, each extending a mapped superclass of the upstream
 * {@code sqlserver-samples-persistence-adventureworks} artifact.
 * <p>
 * The package is {@link NullMarked}: every parameter and return type here is non-null unless marked {@code @Nullable}.
 * Spring Data reads that from the repository interfaces, and rejects a {@code null} argument to a query method with an
 * {@link IllegalArgumentException} before any query runs. A lookup that may find nothing returns an
 * {@link java.util.Optional} instead of a nullable entity.
 * <p>
 * Every repository here is a subinterface of
 * {@link _Repository}, one per entity of the
 * schema, the views with a key included; Spring Data JPA implements them.
 */
@NullMarked
package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import org.jspecify.annotations.NullMarked;
