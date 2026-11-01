package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.CountryRegion;

/**
 * Tests {@link CountryRegionRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class CountryRegionRepository_SpringBootIT
        extends _Repository_SpringBootIT<CountryRegionRepository, CountryRegion, String> {

    /**
     * Creates a new instance.
     */
    CountryRegionRepository_SpringBootIT() {
        super(CountryRegionRepository.class, CountryRegion.class, String.class);
    }
}
