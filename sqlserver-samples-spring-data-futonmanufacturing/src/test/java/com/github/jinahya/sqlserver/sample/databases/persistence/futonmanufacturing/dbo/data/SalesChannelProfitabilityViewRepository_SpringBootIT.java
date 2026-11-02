package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesChannelProfitabilityView;

/**
 * Tests {@link SalesChannelProfitabilityViewRepository} against FutonManufacturing, through
 * {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class SalesChannelProfitabilityViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesChannelProfitabilityViewRepository, SalesChannelProfitabilityView,
                                         String> {

    /**
     * Creates a new instance.
     */
    SalesChannelProfitabilityViewRepository_SpringBootIT() {
        super(SalesChannelProfitabilityViewRepository.class, SalesChannelProfitabilityView.class, String.class);
    }
}
