package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.TransactionHistoryArchive;
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
