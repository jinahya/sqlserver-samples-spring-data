package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.humanresources.JobCandidate;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link JobCandidate}, the {@code HumanResources.JobCandidate} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see JobCandidate
 */
@Repository
public interface JobCandidateRepository
        extends _Repository<JobCandidate, Integer> {

}
