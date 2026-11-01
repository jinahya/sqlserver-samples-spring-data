package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesQuoteDetail;

/**
 * Tests {@link SalesQuoteDetailRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class SalesQuoteDetailRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesQuoteDetailRepository, SalesQuoteDetail, Integer> {

    /**
     * Creates a new instance.
     */
    SalesQuoteDetailRepository_SpringBootIT() {
        super(SalesQuoteDetailRepository.class, SalesQuoteDetail.class, Integer.class);
    }
}
