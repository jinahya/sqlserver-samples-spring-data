package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.dbo.ErrorLog;

/**
 * Tests {@link ErrorLogRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ErrorLogRepository_SpringBootIT
        extends _Repository_SpringBootIT<ErrorLogRepository, ErrorLog, Integer> {

    /**
     * Creates a new instance.
     */
    ErrorLogRepository_SpringBootIT() {
        super(ErrorLogRepository.class, ErrorLog.class, Integer.class);
    }
}
