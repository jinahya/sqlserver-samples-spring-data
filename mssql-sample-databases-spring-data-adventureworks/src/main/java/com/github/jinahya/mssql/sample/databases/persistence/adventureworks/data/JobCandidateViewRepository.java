package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.JobCandidateView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link JobCandidateView}, the {@code HumanResources.vJobCandidate} view of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see JobCandidateView
 */
@Repository
public interface JobCandidateViewRepository
        extends _Repository<JobCandidateView, Integer> {

}
