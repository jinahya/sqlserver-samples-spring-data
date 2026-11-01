package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesReturnDetail;

/**
 * Tests {@link SalesReturnDetailRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class SalesReturnDetailRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesReturnDetailRepository, SalesReturnDetail, Integer> {

    /**
     * Creates a new instance.
     */
    SalesReturnDetailRepository_SpringBootIT() {
        super(SalesReturnDetailRepository.class, SalesReturnDetail.class, Integer.class);
    }
}
