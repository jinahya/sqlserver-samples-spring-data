package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.WorkOrder;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link WorkOrder}, the {@code Production.WorkOrder} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see WorkOrder
 */
@Repository
public interface WorkOrderRepository
        extends _Repository<WorkOrder, Integer> {

}
