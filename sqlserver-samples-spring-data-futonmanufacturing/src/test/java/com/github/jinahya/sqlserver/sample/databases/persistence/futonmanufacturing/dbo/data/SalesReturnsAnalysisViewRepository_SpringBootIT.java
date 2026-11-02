package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesReturnsAnalysisView;

/**
 * Tests {@link SalesReturnsAnalysisViewRepository} against FutonManufacturing, through
 * {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class SalesReturnsAnalysisViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesReturnsAnalysisViewRepository, SalesReturnsAnalysisView, Integer> {

    /**
     * Creates a new instance.
     */
    SalesReturnsAnalysisViewRepository_SpringBootIT() {
        super(SalesReturnsAnalysisViewRepository.class, SalesReturnsAnalysisView.class, Integer.class);
    }
}
