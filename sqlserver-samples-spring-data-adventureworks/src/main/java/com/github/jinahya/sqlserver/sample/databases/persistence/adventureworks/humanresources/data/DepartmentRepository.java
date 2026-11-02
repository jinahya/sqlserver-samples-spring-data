package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.humanresources.Department;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Department}, the {@code HumanResources.Department} table of AdventureWorks.
 * <p>
 * The id is {@link Short}.
 *
 * @see Department
 */
@Repository
public interface DepartmentRepository
        extends _Repository<Department, Long> {

}
