package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.Order;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.data.OrderRepository;

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
