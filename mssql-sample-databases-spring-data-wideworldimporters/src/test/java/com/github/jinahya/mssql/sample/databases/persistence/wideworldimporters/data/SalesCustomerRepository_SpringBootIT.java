package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.Customer;

/**
 * Tests {@link SalesCustomerRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class SalesCustomerRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesCustomerRepository, Customer, Integer> {

    /**
     * Creates a new instance.
     */
    SalesCustomerRepository_SpringBootIT() {
        super(SalesCustomerRepository.class, Customer.class, Integer.class);
    }
}
