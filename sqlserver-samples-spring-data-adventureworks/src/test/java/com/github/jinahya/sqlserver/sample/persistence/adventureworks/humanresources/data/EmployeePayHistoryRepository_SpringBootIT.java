package com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.EmployeePayHistory;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.humanresources.EmployeePayHistoryId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data.EmployeePayHistoryRepository;

/**
 * Tests {@link EmployeePayHistoryRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class EmployeePayHistoryRepository_SpringBootIT
        extends _Repository_SpringBootIT<EmployeePayHistoryRepository, EmployeePayHistory, EmployeePayHistoryId> {

    /**
     * Creates a new instance.
     */
    EmployeePayHistoryRepository_SpringBootIT() {
        super(EmployeePayHistoryRepository.class, EmployeePayHistory.class, EmployeePayHistoryId.class);
    }
}
