package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesRep;

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
