package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.dbo.AwBuildVersion;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link AwBuildVersion}, the {@code dbo.AWBuildVersion} table of AdventureWorks.
 * <p>
 * The id is {@link Short}.
 *
 * @see AwBuildVersion
 */
@Repository
public interface AwBuildVersionRepository
        extends _Repository<AwBuildVersion, Short> {

}
