package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.TransactionType;

/**
 * Tests {@link TransactionTypeRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
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
