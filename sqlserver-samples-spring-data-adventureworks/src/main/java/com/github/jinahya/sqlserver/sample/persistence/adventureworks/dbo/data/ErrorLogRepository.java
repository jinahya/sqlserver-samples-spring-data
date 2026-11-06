package com.github.jinahya.sqlserver.sample.persistence.adventureworks.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.dbo.ErrorLog;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ErrorLog}, the {@code dbo.ErrorLog} table of AdventureWorks.
 * <p>
 * The id is {@link Long}.
 *
 * @see ErrorLog
 */
@Repository
public interface ErrorLogRepository
        extends _Repository<ErrorLog, Long> {

}
