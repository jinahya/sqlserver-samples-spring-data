package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesRepPerformanceView;

/**
 * Tests {@link SalesRepPerformanceViewRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class SalesRepPerformanceViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesRepPerformanceViewRepository, SalesRepPerformanceView, String> {

    /**
     * Creates a new instance.
     */
    SalesRepPerformanceViewRepository_SpringBootIT() {
        super(SalesRepPerformanceViewRepository.class, SalesRepPerformanceView.class, String.class);
    }
}
