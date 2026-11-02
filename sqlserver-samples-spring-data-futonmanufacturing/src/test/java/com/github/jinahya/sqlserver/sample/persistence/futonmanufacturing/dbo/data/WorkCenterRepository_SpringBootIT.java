package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.WorkCenter;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.WorkCenterRepository;

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
