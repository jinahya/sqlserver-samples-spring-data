package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.TransactionHistoryArchive;

/**
 * Tests {@link TransactionHistoryArchiveRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class TransactionHistoryArchiveRepository_SpringBootIT
        extends _Repository_SpringBootIT<TransactionHistoryArchiveRepository, TransactionHistoryArchive, Integer> {

    /**
     * Creates a new instance.
     */
    TransactionHistoryArchiveRepository_SpringBootIT() {
        super(TransactionHistoryArchiveRepository.class, TransactionHistoryArchive.class, Integer.class);
    }
}
