package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SalesReturn;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.SalesReturnRepository;

/**
 * Tests {@link SalesReturnRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class SalesReturnRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesReturnRepository, SalesReturn, Integer> {

    /**
     * Creates a new instance.
     */
    SalesReturnRepository_SpringBootIT() {
        super(SalesReturnRepository.class, SalesReturn.class, Integer.class);
    }
}
