package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.CurrencyRate;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data.CurrencyRateRepository;

/**
 * Tests {@link CurrencyRateRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class CurrencyRateRepository_SpringBootIT
        extends _Repository_SpringBootIT<CurrencyRateRepository, CurrencyRate, Integer> {

    /**
     * Creates a new instance.
     */
    CurrencyRateRepository_SpringBootIT() {
        super(CurrencyRateRepository.class, CurrencyRate.class, Integer.class);
    }
}
