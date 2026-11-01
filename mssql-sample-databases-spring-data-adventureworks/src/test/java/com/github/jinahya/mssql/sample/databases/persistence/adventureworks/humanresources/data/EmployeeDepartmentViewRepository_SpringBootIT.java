package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.EmployeeDepartmentView;

/**
 * Tests {@link EmployeeDepartmentViewRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class EmployeeDepartmentViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<EmployeeDepartmentViewRepository, EmployeeDepartmentView, Integer> {

    /**
     * Creates a new instance.
     */
    EmployeeDepartmentViewRepository_SpringBootIT() {
        super(EmployeeDepartmentViewRepository.class, EmployeeDepartmentView.class, Integer.class);
    }
}
