package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.EmployeeDepartmentHistory;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.humanresources.MappedEmployeeDepartmentHistoryId;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link EmployeeDepartmentHistory}, the {@code HumanResources.EmployeeDepartmentHistory} table of
 * AdventureWorks.
 * <p>
 * The id is {@link MappedEmployeeDepartmentHistoryId}, upstream's id class, which the entity names with {@code
 * @IdClass}.
 *
 * @see EmployeeDepartmentHistory
 */
@Repository
public interface EmployeeDepartmentHistoryRepository
        extends _Repository<EmployeeDepartmentHistory, MappedEmployeeDepartmentHistoryId> {

}
