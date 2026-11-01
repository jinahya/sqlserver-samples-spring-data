/**
 * Spring Data repositories for the entities of FutonManufacturing, which live in the sibling packages of this one, one
 * per schema ({@code dbo}): this module's own entities, each extending a mapped superclass of the upstream
 * {@code mssql-sample-databases-persistence-futonmanufacturing} artifact.
 * <p>
 * The package is {@link NullMarked}: every parameter and return type here is non-null unless marked {@code @Nullable}.
 * Spring Data reads that from the repository interfaces, and rejects a {@code null} argument to a query method with an
 * {@link IllegalArgumentException} before any query runs. A lookup that may find nothing returns an
 * {@link java.util.Optional} instead of a nullable entity.
 * <p>
 * Every repository here is a subinterface of {@link _Repository}, one per entity, the views with a key included, since
 * each is an entity of its own; Spring Data JPA implements them.
 */
@NullMarked
package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import org.jspecify.annotations.NullMarked;
