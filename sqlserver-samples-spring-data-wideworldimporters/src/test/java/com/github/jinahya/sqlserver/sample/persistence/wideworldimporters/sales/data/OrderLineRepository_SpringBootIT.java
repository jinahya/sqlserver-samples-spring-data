package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.OrderLine;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.data.OrderLineRepository;

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
