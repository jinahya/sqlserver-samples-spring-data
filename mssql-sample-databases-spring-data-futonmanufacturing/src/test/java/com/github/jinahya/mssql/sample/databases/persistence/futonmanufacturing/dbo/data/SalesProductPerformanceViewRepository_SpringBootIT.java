package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesProductPerformanceView;

/**
 * Tests {@link SalesProductPerformanceViewRepository} against FutonManufacturing, through
 * {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class SalesProductPerformanceViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesProductPerformanceViewRepository, SalesProductPerformanceView, String> {

    /**
     * Creates a new instance.
     */
    SalesProductPerformanceViewRepository_SpringBootIT() {
        super(SalesProductPerformanceViewRepository.class, SalesProductPerformanceView.class, String.class);
    }
}
