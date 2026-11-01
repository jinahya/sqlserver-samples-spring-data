package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.TransactionHistoryArchive;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link TransactionHistoryArchive}, the {@code Production.TransactionHistoryArchive} table of
 * AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see TransactionHistoryArchive
 */
@Repository
public interface TransactionHistoryArchiveRepository
        extends _Repository<TransactionHistoryArchive, Integer> {

}
