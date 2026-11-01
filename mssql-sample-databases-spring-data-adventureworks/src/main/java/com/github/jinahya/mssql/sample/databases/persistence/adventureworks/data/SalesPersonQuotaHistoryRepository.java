package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.sales.MappedSalesPersonQuotaHistoryId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SalesPersonQuotaHistory;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesPersonQuotaHistory}, the {@code Sales.SalesPersonQuotaHistory} table of AdventureWorks.
 * <p>
 * The id is {@link MappedSalesPersonQuotaHistoryId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see SalesPersonQuotaHistory
 */
@Repository
public interface SalesPersonQuotaHistoryRepository
        extends _Repository<SalesPersonQuotaHistory, MappedSalesPersonQuotaHistoryId> {

}
