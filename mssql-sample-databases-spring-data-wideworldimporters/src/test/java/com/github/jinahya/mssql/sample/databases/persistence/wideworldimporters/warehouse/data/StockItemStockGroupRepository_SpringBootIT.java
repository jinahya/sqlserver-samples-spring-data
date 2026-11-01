package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.warehouse.StockItemStockGroup;

/**
 * Tests {@link StockItemStockGroupRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class StockItemStockGroupRepository_SpringBootIT
        extends _Repository_SpringBootIT<StockItemStockGroupRepository, StockItemStockGroup, Integer> {

    /**
     * Creates a new instance.
     */
    StockItemStockGroupRepository_SpringBootIT() {
        super(StockItemStockGroupRepository.class, StockItemStockGroup.class, Integer.class);
    }
}
