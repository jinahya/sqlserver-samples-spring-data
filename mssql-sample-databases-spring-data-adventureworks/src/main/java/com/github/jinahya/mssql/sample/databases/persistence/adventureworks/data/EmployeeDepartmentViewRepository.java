package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.EmployeeDepartmentView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link EmployeeDepartmentView}, the {@code HumanResources.vEmployeeDepartment} view of
 * AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see EmployeeDepartmentView
 */
@Repository
public interface EmployeeDepartmentViewRepository
        extends _Repository<EmployeeDepartmentView, Integer> {

}
