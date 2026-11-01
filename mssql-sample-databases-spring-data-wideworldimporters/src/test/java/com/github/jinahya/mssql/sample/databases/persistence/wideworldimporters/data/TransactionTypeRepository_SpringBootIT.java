package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.TransactionType;

/**
 * Tests {@link TransactionTypeRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class TransactionTypeRepository_SpringBootIT
        extends _Repository_SpringBootIT<TransactionTypeRepository, TransactionType, Integer> {

    /**
     * Creates a new instance.
     */
    TransactionTypeRepository_SpringBootIT() {
        super(TransactionTypeRepository.class, TransactionType.class, Integer.class);
    }
}
