package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.JobCandidate;

/**
 * Tests {@link JobCandidateRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class JobCandidateRepository_SpringBootIT
        extends _Repository_SpringBootIT<JobCandidateRepository, JobCandidate, Integer> {

    /**
     * Creates a new instance.
     */
    JobCandidateRepository_SpringBootIT() {
        super(JobCandidateRepository.class, JobCandidate.class, Integer.class);
    }
}
