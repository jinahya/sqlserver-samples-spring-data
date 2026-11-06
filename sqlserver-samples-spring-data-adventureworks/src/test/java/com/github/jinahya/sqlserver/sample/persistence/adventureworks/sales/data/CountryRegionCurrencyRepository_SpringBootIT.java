package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.CountryRegionCurrencyId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.CountryRegionCurrency;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data.CountryRegionCurrencyRepository;

/**
 * Tests {@link CountryRegionCurrencyRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class CountryRegionCurrencyRepository_SpringBootIT
        extends _Repository_SpringBootIT<CountryRegionCurrencyRepository, CountryRegionCurrency,
                                         CountryRegionCurrencyId> {

    /**
     * Creates a new instance.
     */
    CountryRegionCurrencyRepository_SpringBootIT() {
        super(CountryRegionCurrencyRepository.class, CountryRegionCurrency.class, CountryRegionCurrencyId.class);
    }
}
