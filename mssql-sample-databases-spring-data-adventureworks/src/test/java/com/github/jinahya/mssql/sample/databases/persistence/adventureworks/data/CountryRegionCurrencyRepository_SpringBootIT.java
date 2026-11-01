package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.sales.MappedCountryRegionCurrencyId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.CountryRegionCurrency;

/**
 * Tests {@link CountryRegionCurrencyRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class CountryRegionCurrencyRepository_SpringBootIT
        extends _Repository_SpringBootIT<CountryRegionCurrencyRepository, CountryRegionCurrency,
                                         MappedCountryRegionCurrencyId> {

    /**
     * Creates a new instance.
     */
    CountryRegionCurrencyRepository_SpringBootIT() {
        super(CountryRegionCurrencyRepository.class, CountryRegionCurrency.class, MappedCountryRegionCurrencyId.class);
    }
}
