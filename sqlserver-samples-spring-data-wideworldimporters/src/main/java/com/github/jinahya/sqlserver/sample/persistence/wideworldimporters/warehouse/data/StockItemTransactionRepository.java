package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.StockItemTransaction;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link StockItemTransaction}, the {@code Warehouse.StockItemTransactions} table of
 * WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see StockItemTransaction
 */
@Repository
public interface StockItemTransactionRepository
        extends _Repository<StockItemTransaction, Integer> {

}
