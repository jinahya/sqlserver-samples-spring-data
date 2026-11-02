package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.dbo.ErrorLog;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ErrorLog}, the {@code dbo.ErrorLog} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see ErrorLog
 */
@Repository
public interface ErrorLogRepository
        extends _Repository<ErrorLog, Long> {

}
