package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.warehouse.StockItem;

/**
 * Tests {@link StockItemRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class StockItemRepository_SpringBootIT
        extends _Repository_SpringBootIT<StockItemRepository, StockItem, Integer> {

    /**
     * Creates a new instance.
     */
    StockItemRepository_SpringBootIT() {
        super(StockItemRepository.class, StockItem.class, Integer.class);
    }
}
