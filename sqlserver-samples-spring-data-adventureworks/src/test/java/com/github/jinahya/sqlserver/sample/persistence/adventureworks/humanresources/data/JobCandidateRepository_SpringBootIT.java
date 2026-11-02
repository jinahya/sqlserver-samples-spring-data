package com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.JobCandidate;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data.JobCandidateRepository;

/**
 * Tests {@link JobCandidateRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class JobCandidateRepository_SpringBootIT
        extends _Repository_SpringBootIT<JobCandidateRepository, JobCandidate, Long> {

    /**
     * Creates a new instance.
     */
    JobCandidateRepository_SpringBootIT() {
        super(JobCandidateRepository.class, JobCandidate.class, Long.class);
    }
}
