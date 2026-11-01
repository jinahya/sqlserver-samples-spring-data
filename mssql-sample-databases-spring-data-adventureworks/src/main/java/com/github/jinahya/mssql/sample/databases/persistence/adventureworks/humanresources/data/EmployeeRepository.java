package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.Employee;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Employee}, the {@code HumanResources.Employee} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Employee
 */
@Repository
public interface EmployeeRepository
        extends _Repository<Employee, Integer> {

}
