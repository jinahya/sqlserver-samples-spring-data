package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.StockGroup;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.data.StockGroupRepository;

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
