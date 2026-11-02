package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.SalesPerson;

/**
 * Tests {@link SalesPersonRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class SalesPersonRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesPersonRepository, SalesPerson, Integer> {

    /**
     * Creates a new instance.
     */
    SalesPersonRepository_SpringBootIT() {
        super(SalesPersonRepository.class, SalesPerson.class, Integer.class);
    }
}
