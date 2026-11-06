package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.WorkOrderRoutingId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.WorkOrderRouting;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.WorkOrderRoutingRepository;

/**
 * Tests {@link WorkOrderRoutingRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class WorkOrderRoutingRepository_SpringBootIT
        extends _Repository_SpringBootIT<WorkOrderRoutingRepository, WorkOrderRouting, WorkOrderRoutingId> {

    /**
     * Creates a new instance.
     */
    WorkOrderRoutingRepository_SpringBootIT() {
        super(WorkOrderRoutingRepository.class, WorkOrderRouting.class, WorkOrderRoutingId.class);
    }
}
