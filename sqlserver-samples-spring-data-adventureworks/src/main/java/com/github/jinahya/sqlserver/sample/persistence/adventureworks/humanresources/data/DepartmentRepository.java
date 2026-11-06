package com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.Department;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Department}, the {@code HumanResources.Department} table of AdventureWorks.
 * <p>
 * The id is {@link Long}.
 *
 * @see Department
 */
@Repository
public interface DepartmentRepository
        extends _Repository<Department, Long> {

}
