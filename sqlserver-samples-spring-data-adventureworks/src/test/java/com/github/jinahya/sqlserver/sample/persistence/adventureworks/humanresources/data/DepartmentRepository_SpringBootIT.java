package com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.Department;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data.DepartmentRepository;

/**
 * Tests {@link DepartmentRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class DepartmentRepository_SpringBootIT
        extends _Repository_SpringBootIT<DepartmentRepository, Department, Long> {

    /**
     * Creates a new instance.
     */
    DepartmentRepository_SpringBootIT() {
        super(DepartmentRepository.class, Department.class, Long.class);
    }
}
