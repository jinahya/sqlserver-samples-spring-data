package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.WorkCenter;

/**
 * Tests {@link WorkCenterRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class WorkCenterRepository_SpringBootIT
        extends _Repository_SpringBootIT<WorkCenterRepository, WorkCenter, Integer> {

    /**
     * Creates a new instance.
     */
    WorkCenterRepository_SpringBootIT() {
        super(WorkCenterRepository.class, WorkCenter.class, Integer.class);
    }
}
