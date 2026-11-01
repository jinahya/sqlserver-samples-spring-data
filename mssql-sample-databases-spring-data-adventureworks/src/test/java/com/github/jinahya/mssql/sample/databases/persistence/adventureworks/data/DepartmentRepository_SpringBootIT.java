package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.Department;

/**
 * Tests {@link DepartmentRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class DepartmentRepository_SpringBootIT
        extends _Repository_SpringBootIT<DepartmentRepository, Department, Short> {

    /**
     * Creates a new instance.
     */
    DepartmentRepository_SpringBootIT() {
        super(DepartmentRepository.class, Department.class, Short.class);
    }
}
