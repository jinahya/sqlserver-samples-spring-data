package com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.EmployeeView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link EmployeeView}, the {@code HumanResources.vEmployee} view of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see EmployeeView
 */
@Repository
public interface EmployeeViewRepository
        extends _Repository<EmployeeView, Integer> {

}
