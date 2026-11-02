package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.sales.CustomerTransaction;

/**
 * Tests {@link CustomerTransactionRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class CustomerTransactionRepository_SpringBootIT
        extends _Repository_SpringBootIT<CustomerTransactionRepository, CustomerTransaction, Integer> {

    /**
     * Creates a new instance.
     */
    CustomerTransactionRepository_SpringBootIT() {
        super(CustomerTransactionRepository.class, CustomerTransaction.class, Integer.class);
    }
}
