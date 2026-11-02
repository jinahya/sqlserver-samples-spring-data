package com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.JobCandidateView;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data.JobCandidateViewRepository;

/**
 * Tests {@link JobCandidateViewRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class JobCandidateViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<JobCandidateViewRepository, JobCandidateView, Long> {

    /**
     * Creates a new instance.
     */
    JobCandidateViewRepository_SpringBootIT() {
        super(JobCandidateViewRepository.class, JobCandidateView.class, Long.class);
    }
}
