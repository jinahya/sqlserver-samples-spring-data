package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.Order;

/**
 * Tests {@link OrderRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class OrderRepository_SpringBootIT
        extends _Repository_SpringBootIT<OrderRepository, Order, Integer> {

    /**
     * Creates a new instance.
     */
    OrderRepository_SpringBootIT() {
        super(OrderRepository.class, Order.class, Integer.class);
    }
}
