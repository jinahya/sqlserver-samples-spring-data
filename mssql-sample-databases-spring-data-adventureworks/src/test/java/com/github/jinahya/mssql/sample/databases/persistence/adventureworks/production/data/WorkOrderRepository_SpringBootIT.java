package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.WorkOrder;

/**
 * Tests {@link WorkOrderRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class WorkOrderRepository_SpringBootIT
        extends _Repository_SpringBootIT<WorkOrderRepository, WorkOrder, Integer> {

    /**
     * Creates a new instance.
     */
    WorkOrderRepository_SpringBootIT() {
        super(WorkOrderRepository.class, WorkOrder.class, Integer.class);
    }
}
