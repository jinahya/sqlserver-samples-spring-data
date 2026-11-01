package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.Currency;

/**
 * Tests {@link CurrencyRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class CurrencyRepository_SpringBootIT
        extends _Repository_SpringBootIT<CurrencyRepository, Currency, String> {

    /**
     * Creates a new instance.
     */
    CurrencyRepository_SpringBootIT() {
        super(CurrencyRepository.class, Currency.class, String.class);
    }
}
