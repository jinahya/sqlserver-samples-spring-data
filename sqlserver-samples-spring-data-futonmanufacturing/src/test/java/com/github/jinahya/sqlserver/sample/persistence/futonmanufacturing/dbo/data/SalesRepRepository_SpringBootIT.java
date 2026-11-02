package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SalesRep;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.SalesRepRepository;

/**
 * Tests {@link SalesRepRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class SalesRepRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesRepRepository, SalesRep, Integer> {

    /**
     * Creates a new instance.
     */
    SalesRepRepository_SpringBootIT() {
        super(SalesRepRepository.class, SalesRep.class, Integer.class);
    }
}
