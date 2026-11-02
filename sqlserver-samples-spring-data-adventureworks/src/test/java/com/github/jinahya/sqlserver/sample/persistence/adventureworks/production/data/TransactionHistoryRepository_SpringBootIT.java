package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.TransactionHistory;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.TransactionHistoryRepository;

/**
 * Tests {@link TransactionHistoryRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class TransactionHistoryRepository_SpringBootIT
        extends _Repository_SpringBootIT<TransactionHistoryRepository, TransactionHistory, Integer> {

    /**
     * Creates a new instance.
     */
    TransactionHistoryRepository_SpringBootIT() {
        super(TransactionHistoryRepository.class, TransactionHistory.class, Integer.class);
    }
}
