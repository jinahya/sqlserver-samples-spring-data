package com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.JobCandidateView;
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
        extends _Repository<JobCandidateView, Long> {

}
