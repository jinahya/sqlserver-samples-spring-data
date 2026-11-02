package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.dbo.ErrorLog;

/**
 * Tests {@link ErrorLogRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ErrorLogRepository_SpringBootIT
        extends _Repository_SpringBootIT<ErrorLogRepository, ErrorLog, Long> {

    /**
     * Creates a new instance.
     */
    ErrorLogRepository_SpringBootIT() {
        super(ErrorLogRepository.class, ErrorLog.class, Long.class);
    }
}
