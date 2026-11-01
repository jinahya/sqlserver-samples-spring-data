package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.production.MappedWorkOrderRoutingId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.WorkOrderRouting;

/**
 * Tests {@link WorkOrderRoutingRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class WorkOrderRoutingRepository_SpringBootIT
        extends _Repository_SpringBootIT<WorkOrderRoutingRepository, WorkOrderRouting, MappedWorkOrderRoutingId> {

    /**
     * Creates a new instance.
     */
    WorkOrderRoutingRepository_SpringBootIT() {
        super(WorkOrderRoutingRepository.class, WorkOrderRouting.class, MappedWorkOrderRoutingId.class);
    }
}
