package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.warehouse.StockGroup;

/**
 * Tests {@link StockGroupRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class StockGroupRepository_SpringBootIT
        extends _Repository_SpringBootIT<StockGroupRepository, StockGroup, Integer> {

    /**
     * Creates a new instance.
     */
    StockGroupRepository_SpringBootIT() {
        super(StockGroupRepository.class, StockGroup.class, Integer.class);
    }
}
