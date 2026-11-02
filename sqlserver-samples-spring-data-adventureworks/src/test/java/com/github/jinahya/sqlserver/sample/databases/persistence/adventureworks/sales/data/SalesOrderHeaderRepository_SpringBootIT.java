package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.SalesOrderHeader;

/**
 * Tests {@link SalesOrderHeaderRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class SalesOrderHeaderRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesOrderHeaderRepository, SalesOrderHeader, Integer> {

    /**
     * Creates a new instance.
     */
    SalesOrderHeaderRepository_SpringBootIT() {
        super(SalesOrderHeaderRepository.class, SalesOrderHeader.class, Integer.class);
    }
}
