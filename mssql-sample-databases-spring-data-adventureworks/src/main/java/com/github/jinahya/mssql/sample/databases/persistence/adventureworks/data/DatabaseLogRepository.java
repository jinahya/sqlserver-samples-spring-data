package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.dbo.DatabaseLog;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link DatabaseLog}, the {@code dbo.DatabaseLog} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see DatabaseLog
 */
@Repository
public interface DatabaseLogRepository
        extends _Repository<DatabaseLog, Integer> {

}
