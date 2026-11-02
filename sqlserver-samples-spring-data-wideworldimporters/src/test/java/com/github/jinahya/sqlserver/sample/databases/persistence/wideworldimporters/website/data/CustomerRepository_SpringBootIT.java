package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.website.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.website.Customer;

/**
 * Tests {@link CustomerRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class CustomerRepository_SpringBootIT
        extends _Repository_SpringBootIT<CustomerRepository, Customer, Integer> {

    /**
     * Creates a new instance.
     */
    CustomerRepository_SpringBootIT() {
        super(CustomerRepository.class, Customer.class, Integer.class);
    }
}
