package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.application.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.application.City;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository_SpringBootIT;

/**
 * Tests {@link CityRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class CityRepository_SpringBootIT
        extends _Repository_SpringBootIT<CityRepository, City, Integer> {

    /**
     * Creates a new instance.
     */
    CityRepository_SpringBootIT() {
        super(CityRepository.class, City.class, Integer.class);
    }
}
