package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.WorkOrderRoutingId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.WorkOrderRouting;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link WorkOrderRouting}, the {@code Production.WorkOrderRouting} table of AdventureWorks.
 * <p>
 * The id is {@link WorkOrderRoutingId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see WorkOrderRouting
 */
@Repository
public interface WorkOrderRoutingRepository
        extends _Repository<WorkOrderRouting, WorkOrderRoutingId> {

}
