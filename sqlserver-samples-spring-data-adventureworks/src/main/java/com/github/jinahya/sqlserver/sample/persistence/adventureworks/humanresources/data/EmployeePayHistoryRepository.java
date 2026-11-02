package com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.EmployeePayHistory;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.humanresources.MappedEmployeePayHistoryId;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link EmployeePayHistory}, the {@code HumanResources.EmployeePayHistory} table of AdventureWorks.
 * <p>
 * The id is {@link MappedEmployeePayHistoryId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see EmployeePayHistory
 */
@Repository
public interface EmployeePayHistoryRepository
        extends _Repository<EmployeePayHistory, MappedEmployeePayHistoryId> {

}
