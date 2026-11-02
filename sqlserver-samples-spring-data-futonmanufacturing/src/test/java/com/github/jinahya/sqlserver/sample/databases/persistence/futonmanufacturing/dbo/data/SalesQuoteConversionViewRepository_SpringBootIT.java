package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesQuoteConversionView;

/**
 * Tests {@link SalesQuoteConversionViewRepository} against FutonManufacturing, through
 * {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class SalesQuoteConversionViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesQuoteConversionViewRepository, SalesQuoteConversionView, String> {

    /**
     * Creates a new instance.
     */
    SalesQuoteConversionViewRepository_SpringBootIT() {
        super(SalesQuoteConversionViewRepository.class, SalesQuoteConversionView.class, String.class);
    }
}
