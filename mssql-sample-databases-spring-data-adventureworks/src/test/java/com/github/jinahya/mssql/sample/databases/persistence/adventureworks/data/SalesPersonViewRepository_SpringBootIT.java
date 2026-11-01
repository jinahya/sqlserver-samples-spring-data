package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SalesPersonView;

/**
 * Tests {@link SalesPersonViewRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class SalesPersonViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesPersonViewRepository, SalesPersonView, Integer> {

    /**
     * Creates a new instance.
     */
    SalesPersonViewRepository_SpringBootIT() {
        super(SalesPersonViewRepository.class, SalesPersonView.class, Integer.class);
    }
}
