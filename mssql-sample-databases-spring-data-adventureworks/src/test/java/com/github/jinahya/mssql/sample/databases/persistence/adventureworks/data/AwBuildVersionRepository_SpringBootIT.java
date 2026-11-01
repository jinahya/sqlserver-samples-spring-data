package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.dbo.AwBuildVersion;

/**
 * Tests {@link AwBuildVersionRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class AwBuildVersionRepository_SpringBootIT
        extends _Repository_SpringBootIT<AwBuildVersionRepository, AwBuildVersion, Short> {

    /**
     * Creates a new instance.
     */
    AwBuildVersionRepository_SpringBootIT() {
        super(AwBuildVersionRepository.class, AwBuildVersion.class, Short.class);
    }
}
