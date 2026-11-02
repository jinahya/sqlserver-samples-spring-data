package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesCustomerAnalysisView;

/**
 * Tests {@link SalesCustomerAnalysisViewRepository} against FutonManufacturing, through
 * {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class SalesCustomerAnalysisViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesCustomerAnalysisViewRepository, SalesCustomerAnalysisView, Integer> {

    /**
     * Creates a new instance.
     */
    SalesCustomerAnalysisViewRepository_SpringBootIT() {
        super(SalesCustomerAnalysisViewRepository.class, SalesCustomerAnalysisView.class, Integer.class);
    }
}
