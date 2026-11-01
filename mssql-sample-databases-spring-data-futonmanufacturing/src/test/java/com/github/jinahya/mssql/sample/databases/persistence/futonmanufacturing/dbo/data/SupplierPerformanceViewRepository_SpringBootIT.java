package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SupplierPerformanceView;

/**
 * Tests {@link SupplierPerformanceViewRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class SupplierPerformanceViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<SupplierPerformanceViewRepository, SupplierPerformanceView, String> {

    /**
     * Creates a new instance.
     */
    SupplierPerformanceViewRepository_SpringBootIT() {
        super(SupplierPerformanceViewRepository.class, SupplierPerformanceView.class, String.class);
    }
}
