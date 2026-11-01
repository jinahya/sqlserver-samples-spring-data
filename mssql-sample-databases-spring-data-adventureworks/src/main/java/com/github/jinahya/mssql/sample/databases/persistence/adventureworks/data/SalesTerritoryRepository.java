package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SalesTerritory;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesTerritory}, the {@code Sales.SalesTerritory} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SalesTerritory
 */
@Repository
public interface SalesTerritoryRepository
        extends _Repository<SalesTerritory, Integer> {

}
