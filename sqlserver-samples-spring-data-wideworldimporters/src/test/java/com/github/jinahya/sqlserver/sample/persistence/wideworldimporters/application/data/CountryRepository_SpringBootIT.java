package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.application.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.application.Country;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.application.data.CountryRepository;

/**
 * Tests {@link CountryRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class CountryRepository_SpringBootIT
        extends _Repository_SpringBootIT<CountryRepository, Country, Integer> {

    /**
     * Creates a new instance.
     */
    CountryRepository_SpringBootIT() {
        super(CountryRepository.class, Country.class, Integer.class);
    }
}
