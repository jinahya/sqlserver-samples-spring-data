package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.sales.MappedSalesTerritoryHistoryId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SalesTerritoryHistory;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesTerritoryHistory}, the {@code Sales.SalesTerritoryHistory} table of AdventureWorks.
 * <p>
 * The id is {@link MappedSalesTerritoryHistoryId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see SalesTerritoryHistory
 */
@Repository
public interface SalesTerritoryHistoryRepository
        extends _Repository<SalesTerritoryHistory, MappedSalesTerritoryHistoryId> {

}
