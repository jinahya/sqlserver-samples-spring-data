package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.SalesTerritoryHistoryId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SalesTerritoryHistory;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data.SalesTerritoryHistoryRepository;

/**
 * Tests {@link SalesTerritoryHistoryRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class SalesTerritoryHistoryRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesTerritoryHistoryRepository, SalesTerritoryHistory,
                                         SalesTerritoryHistoryId> {

    /**
     * Creates a new instance.
     */
    SalesTerritoryHistoryRepository_SpringBootIT() {
        super(SalesTerritoryHistoryRepository.class, SalesTerritoryHistory.class, SalesTerritoryHistoryId.class);
    }
}
