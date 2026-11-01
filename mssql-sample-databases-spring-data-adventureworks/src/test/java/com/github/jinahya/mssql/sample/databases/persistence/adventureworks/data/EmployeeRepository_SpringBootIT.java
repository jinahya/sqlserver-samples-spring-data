package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.Employee;

/**
 * Tests {@link EmployeeRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class EmployeeRepository_SpringBootIT
        extends _Repository_SpringBootIT<EmployeeRepository, Employee, Integer> {

    /**
     * Creates a new instance.
     */
    EmployeeRepository_SpringBootIT() {
        super(EmployeeRepository.class, Employee.class, Integer.class);
    }
}
