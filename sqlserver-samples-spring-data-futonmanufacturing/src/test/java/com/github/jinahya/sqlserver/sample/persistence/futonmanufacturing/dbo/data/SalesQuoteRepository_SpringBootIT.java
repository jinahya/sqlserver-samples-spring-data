package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SalesQuote;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.SalesQuoteRepository;

/**
 * Tests {@link SalesQuoteRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class SalesQuoteRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesQuoteRepository, SalesQuote, Integer> {

    /**
     * Creates a new instance.
     */
    SalesQuoteRepository_SpringBootIT() {
        super(SalesQuoteRepository.class, SalesQuote.class, Integer.class);
    }
}
