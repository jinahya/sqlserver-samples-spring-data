package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SalesTerritory;

/**
 * Tests {@link SalesTerritoryRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class SalesTerritoryRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesTerritoryRepository, SalesTerritory, Integer> {

    /**
     * Creates a new instance.
     */
    SalesTerritoryRepository_SpringBootIT() {
        super(SalesTerritoryRepository.class, SalesTerritory.class, Integer.class);
    }
}
