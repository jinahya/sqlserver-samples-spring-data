package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.SalesTerritoryHistoryId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SalesTerritoryHistory;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesTerritoryHistory}, the {@code Sales.SalesTerritoryHistory} table of AdventureWorks.
 * <p>
 * The id is {@link SalesTerritoryHistoryId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see SalesTerritoryHistory
 */
@Repository
public interface SalesTerritoryHistoryRepository
        extends _Repository<SalesTerritoryHistory, SalesTerritoryHistoryId> {

}
