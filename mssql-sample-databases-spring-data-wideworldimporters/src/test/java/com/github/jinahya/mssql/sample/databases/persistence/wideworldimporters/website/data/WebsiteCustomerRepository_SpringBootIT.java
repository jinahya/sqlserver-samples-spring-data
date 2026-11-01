package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.website.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.website.Customer;

/**
 * Tests {@link WebsiteCustomerRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class WebsiteCustomerRepository_SpringBootIT
        extends _Repository_SpringBootIT<WebsiteCustomerRepository, Customer, Integer> {

    /**
     * Creates a new instance.
     */
    WebsiteCustomerRepository_SpringBootIT() {
        super(WebsiteCustomerRepository.class, Customer.class, Integer.class);
    }
}
