package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.purchasing.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.purchasing.SupplierTransaction;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.purchasing.data.SupplierTransactionRepository;

/**
 * Tests {@link SupplierTransactionRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class SupplierTransactionRepository_SpringBootIT
        extends _Repository_SpringBootIT<SupplierTransactionRepository, SupplierTransaction, Integer> {

    /**
     * Creates a new instance.
     */
    SupplierTransactionRepository_SpringBootIT() {
        super(SupplierTransactionRepository.class, SupplierTransaction.class, Integer.class);
    }
}
