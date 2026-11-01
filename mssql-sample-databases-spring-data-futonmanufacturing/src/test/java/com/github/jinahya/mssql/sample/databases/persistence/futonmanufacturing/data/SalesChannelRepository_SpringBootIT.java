package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesChannel;

/**
 * Tests {@link SalesChannelRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class SalesChannelRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesChannelRepository, SalesChannel, Integer> {

    /**
     * Creates a new instance.
     */
    SalesChannelRepository_SpringBootIT() {
        super(SalesChannelRepository.class, SalesChannel.class, Integer.class);
    }
}
