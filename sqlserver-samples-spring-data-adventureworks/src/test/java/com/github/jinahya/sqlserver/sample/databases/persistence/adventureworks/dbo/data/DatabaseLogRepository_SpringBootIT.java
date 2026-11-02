package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.dbo.DatabaseLog;

/**
 * Tests {@link DatabaseLogRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class DatabaseLogRepository_SpringBootIT
        extends _Repository_SpringBootIT<DatabaseLogRepository, DatabaseLog, Long> {

    /**
     * Creates a new instance.
     */
    DatabaseLogRepository_SpringBootIT() {
        super(DatabaseLogRepository.class, DatabaseLog.class, Long.class);
    }
}
