package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SalesTaxRate;

/**
 * Tests {@link SalesTaxRateRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class SalesTaxRateRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesTaxRateRepository, SalesTaxRate, Integer> {

    /**
     * Creates a new instance.
     */
    SalesTaxRateRepository_SpringBootIT() {
        super(SalesTaxRateRepository.class, SalesTaxRate.class, Integer.class);
    }
}
