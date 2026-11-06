package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.SalesPersonQuotaHistoryId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SalesPersonQuotaHistory;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesPersonQuotaHistory}, the {@code Sales.SalesPersonQuotaHistory} table of AdventureWorks.
 * <p>
 * The id is {@link SalesPersonQuotaHistoryId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see SalesPersonQuotaHistory
 */
@Repository
public interface SalesPersonQuotaHistoryRepository
        extends _Repository<SalesPersonQuotaHistory, SalesPersonQuotaHistoryId> {

}
