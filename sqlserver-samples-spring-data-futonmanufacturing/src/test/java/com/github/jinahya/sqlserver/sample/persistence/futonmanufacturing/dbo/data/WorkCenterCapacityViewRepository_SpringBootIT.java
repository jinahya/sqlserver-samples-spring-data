package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.WorkCenterCapacityView;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.WorkCenterCapacityViewRepository;

/**
 * Tests {@link WorkCenterCapacityViewRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class WorkCenterCapacityViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<WorkCenterCapacityViewRepository, WorkCenterCapacityView, String> {

    /**
     * Creates a new instance.
     */
    WorkCenterCapacityViewRepository_SpringBootIT() {
        super(WorkCenterCapacityViewRepository.class, WorkCenterCapacityView.class, String.class);
    }
}
