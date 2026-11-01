package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.production.MappedWorkOrderRoutingId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.WorkOrderRouting;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link WorkOrderRouting}, the {@code Production.WorkOrderRouting} table of AdventureWorks.
 * <p>
 * The id is {@link MappedWorkOrderRoutingId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see WorkOrderRouting
 */
@Repository
public interface WorkOrderRoutingRepository
        extends _Repository<WorkOrderRouting, MappedWorkOrderRoutingId> {

}
