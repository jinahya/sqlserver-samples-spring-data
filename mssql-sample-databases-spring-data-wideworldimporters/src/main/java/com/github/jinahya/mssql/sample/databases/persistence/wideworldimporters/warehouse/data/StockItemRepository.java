package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.warehouse.StockItem;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link StockItem}, the {@code Warehouse.StockItems} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see StockItem
 */
@Repository
public interface StockItemRepository
        extends _Repository<StockItem, Integer> {

}
