package com.github.jinahya.sqlserver.sample.persistence.adventureworks.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.dbo.AwBuildVersion;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.dbo.data.AwBuildVersionRepository;

/**
 * Tests {@link AwBuildVersionRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class AwBuildVersionRepository_SpringBootIT
        extends _Repository_SpringBootIT<AwBuildVersionRepository, AwBuildVersion, Long> {

    /**
     * Creates a new instance.
     */
    AwBuildVersionRepository_SpringBootIT() {
        super(AwBuildVersionRepository.class, AwBuildVersion.class, Long.class);
    }
}
