package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesCustomerSegmentationView;

/**
 * Tests {@link SalesCustomerSegmentationViewRepository} against FutonManufacturing, through
 * {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class SalesCustomerSegmentationViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesCustomerSegmentationViewRepository, SalesCustomerSegmentationView,
                                         Integer> {

    /**
     * Creates a new instance.
     */
    SalesCustomerSegmentationViewRepository_SpringBootIT() {
        super(SalesCustomerSegmentationViewRepository.class, SalesCustomerSegmentationView.class, Integer.class);
    }
}
