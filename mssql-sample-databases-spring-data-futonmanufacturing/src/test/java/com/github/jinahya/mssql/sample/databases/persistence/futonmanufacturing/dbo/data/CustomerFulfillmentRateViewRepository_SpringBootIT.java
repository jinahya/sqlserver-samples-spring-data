package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.CustomerFulfillmentRateView;

/**
 * Tests {@link CustomerFulfillmentRateViewRepository} against FutonManufacturing, through
 * {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class CustomerFulfillmentRateViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<CustomerFulfillmentRateViewRepository, CustomerFulfillmentRateView, String> {

    /**
     * Creates a new instance.
     */
    CustomerFulfillmentRateViewRepository_SpringBootIT() {
        super(CustomerFulfillmentRateViewRepository.class, CustomerFulfillmentRateView.class, String.class);
    }
}
