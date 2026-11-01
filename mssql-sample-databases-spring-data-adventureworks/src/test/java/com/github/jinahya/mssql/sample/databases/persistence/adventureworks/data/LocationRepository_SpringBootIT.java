package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.Location;

/**
 * Tests {@link LocationRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class LocationRepository_SpringBootIT
        extends _Repository_SpringBootIT<LocationRepository, Location, Short> {

    /**
     * Creates a new instance.
     */
    LocationRepository_SpringBootIT() {
        super(LocationRepository.class, Location.class, Short.class);
    }
}
