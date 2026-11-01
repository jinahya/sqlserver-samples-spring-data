package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.warehouse.StockItemTransaction;

/**
 * Tests {@link StockItemTransactionRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class StockItemTransactionRepository_SpringBootIT
        extends _Repository_SpringBootIT<StockItemTransactionRepository, StockItemTransaction, Integer> {

    /**
     * Creates a new instance.
     */
    StockItemTransactionRepository_SpringBootIT() {
        super(StockItemTransactionRepository.class, StockItemTransaction.class, Integer.class);
    }
}
