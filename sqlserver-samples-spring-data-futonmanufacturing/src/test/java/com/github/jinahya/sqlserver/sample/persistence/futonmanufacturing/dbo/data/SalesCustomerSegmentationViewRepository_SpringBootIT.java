package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SalesCustomerSegmentationView;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.SalesCustomerSegmentationViewRepository;

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
