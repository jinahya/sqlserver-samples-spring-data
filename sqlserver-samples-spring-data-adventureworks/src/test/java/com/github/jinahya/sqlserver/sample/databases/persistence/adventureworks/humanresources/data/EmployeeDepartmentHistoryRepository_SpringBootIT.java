package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.humanresources.EmployeeDepartmentHistory;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.mapped.humanresources.MappedEmployeeDepartmentHistoryId;

/**
 * Tests {@link EmployeeDepartmentHistoryRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class EmployeeDepartmentHistoryRepository_SpringBootIT
        extends _Repository_SpringBootIT<EmployeeDepartmentHistoryRepository, EmployeeDepartmentHistory,
                                         MappedEmployeeDepartmentHistoryId> {

    /**
     * Creates a new instance.
     */
    EmployeeDepartmentHistoryRepository_SpringBootIT() {
        super(EmployeeDepartmentHistoryRepository.class, EmployeeDepartmentHistory.class,
              MappedEmployeeDepartmentHistoryId.class);
    }
}
