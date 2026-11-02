package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.Customer;

/**
 * Tests {@link CustomerRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
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
