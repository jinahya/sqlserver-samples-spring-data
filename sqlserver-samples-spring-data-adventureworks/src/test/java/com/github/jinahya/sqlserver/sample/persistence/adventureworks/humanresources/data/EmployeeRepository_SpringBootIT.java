package com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.Employee;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data.EmployeeRepository;

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
