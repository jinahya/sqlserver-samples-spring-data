package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.OrderLine;

/**
 * Tests {@link OrderLineRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class OrderLineRepository_SpringBootIT
        extends _Repository_SpringBootIT<OrderLineRepository, OrderLine, Integer> {

    /**
     * Creates a new instance.
     */
    OrderLineRepository_SpringBootIT() {
        super(OrderLineRepository.class, OrderLine.class, Integer.class);
    }
}
