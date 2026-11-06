package com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.EmployeeDepartmentHistory;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.humanresources.EmployeeDepartmentHistoryId;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link EmployeeDepartmentHistory}, the {@code HumanResources.EmployeeDepartmentHistory} table of
 * AdventureWorks.
 * <p>
 * The id is {@link EmployeeDepartmentHistoryId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see EmployeeDepartmentHistory
 */
@Repository
public interface EmployeeDepartmentHistoryRepository
        extends _Repository<EmployeeDepartmentHistory, EmployeeDepartmentHistoryId> {

}
