package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.mapped.sales.MappedSalesPersonQuotaHistoryId;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.SalesPersonQuotaHistory;

/**
 * Tests {@link SalesPersonQuotaHistoryRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class SalesPersonQuotaHistoryRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesPersonQuotaHistoryRepository, SalesPersonQuotaHistory,
                                         MappedSalesPersonQuotaHistoryId> {

    /**
     * Creates a new instance.
     */
    SalesPersonQuotaHistoryRepository_SpringBootIT() {
        super(SalesPersonQuotaHistoryRepository.class, SalesPersonQuotaHistory.class,
              MappedSalesPersonQuotaHistoryId.class);
    }
}
