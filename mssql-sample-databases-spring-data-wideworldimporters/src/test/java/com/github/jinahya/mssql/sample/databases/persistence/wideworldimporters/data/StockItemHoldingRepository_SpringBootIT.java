package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.warehouse.StockItemHolding;

/**
 * Tests {@link StockItemHoldingRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class StockItemHoldingRepository_SpringBootIT
        extends _Repository_SpringBootIT<StockItemHoldingRepository, StockItemHolding, Integer> {

    /**
     * Creates a new instance.
     */
    StockItemHoldingRepository_SpringBootIT() {
        super(StockItemHoldingRepository.class, StockItemHolding.class, Integer.class);
    }
}
