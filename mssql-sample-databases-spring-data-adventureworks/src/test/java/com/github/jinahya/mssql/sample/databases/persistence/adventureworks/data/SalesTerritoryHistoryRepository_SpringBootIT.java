package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.sales.MappedSalesTerritoryHistoryId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SalesTerritoryHistory;

/**
 * Tests {@link SalesTerritoryHistoryRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class SalesTerritoryHistoryRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesTerritoryHistoryRepository, SalesTerritoryHistory,
                                         MappedSalesTerritoryHistoryId> {

    /**
     * Creates a new instance.
     */
    SalesTerritoryHistoryRepository_SpringBootIT() {
        super(SalesTerritoryHistoryRepository.class, SalesTerritoryHistory.class, MappedSalesTerritoryHistoryId.class);
    }
}
