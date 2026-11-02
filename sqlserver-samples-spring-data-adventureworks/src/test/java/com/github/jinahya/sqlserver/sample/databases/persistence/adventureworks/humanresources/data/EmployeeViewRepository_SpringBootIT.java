package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.humanresources.EmployeeView;

/**
 * Tests {@link EmployeeViewRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class EmployeeViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<EmployeeViewRepository, EmployeeView, Integer> {

    /**
     * Creates a new instance.
     */
    EmployeeViewRepository_SpringBootIT() {
        super(EmployeeViewRepository.class, EmployeeView.class, Integer.class);
    }
}
