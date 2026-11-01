package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.warehouse.StockItemStockGroup;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link StockItemStockGroup}, the {@code Warehouse.StockItemStockGroups} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see StockItemStockGroup
 */
@Repository
public interface StockItemStockGroupRepository
        extends _Repository<StockItemStockGroup, Integer> {

}
