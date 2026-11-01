package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.PriceList;

/**
 * Tests {@link PriceListRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class PriceListRepository_SpringBootIT
        extends _Repository_SpringBootIT<PriceListRepository, PriceList, Integer> {

    /**
     * Creates a new instance.
     */
    PriceListRepository_SpringBootIT() {
        super(PriceListRepository.class, PriceList.class, Integer.class);
    }
}
