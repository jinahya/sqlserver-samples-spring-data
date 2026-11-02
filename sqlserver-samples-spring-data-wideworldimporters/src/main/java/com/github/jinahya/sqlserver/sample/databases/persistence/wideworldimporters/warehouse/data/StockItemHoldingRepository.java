package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.StockItemHolding;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link StockItemHolding}, the {@code Warehouse.StockItemHoldings} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see StockItemHolding
 */
@Repository
public interface StockItemHoldingRepository
        extends _Repository<StockItemHolding, Integer> {

}
