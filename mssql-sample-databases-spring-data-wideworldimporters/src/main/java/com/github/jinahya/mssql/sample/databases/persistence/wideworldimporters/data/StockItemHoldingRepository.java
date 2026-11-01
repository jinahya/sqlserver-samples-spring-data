package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.warehouse.StockItemHolding;
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
