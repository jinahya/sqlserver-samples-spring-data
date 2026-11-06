package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.Location;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.LocationRepository;

/**
 * Tests {@link LocationRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class LocationRepository_SpringBootIT
        extends _Repository_SpringBootIT<LocationRepository, Location, Long> {

    /**
     * Creates a new instance.
     */
    LocationRepository_SpringBootIT() {
        super(LocationRepository.class, Location.class, Long.class);
    }
}
