package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.SalesReason;

/**
 * Tests {@link SalesReasonRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class SalesReasonRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesReasonRepository, SalesReason, Integer> {

    /**
     * Creates a new instance.
     */
    SalesReasonRepository_SpringBootIT() {
        super(SalesReasonRepository.class, SalesReason.class, Integer.class);
    }
}
