package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.TransactionHistory;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link TransactionHistory}, the {@code Production.TransactionHistory} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see TransactionHistory
 */
@Repository
public interface TransactionHistoryRepository
        extends _Repository<TransactionHistory, Integer> {

}
