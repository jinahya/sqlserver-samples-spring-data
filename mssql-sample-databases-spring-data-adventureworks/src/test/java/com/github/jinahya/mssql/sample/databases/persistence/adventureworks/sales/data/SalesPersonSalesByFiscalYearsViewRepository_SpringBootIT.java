package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SalesPersonSalesByFiscalYearsView;

/**
 * Tests {@link SalesPersonSalesByFiscalYearsViewRepository} against AdventureWorks, through
 * {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class SalesPersonSalesByFiscalYearsViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesPersonSalesByFiscalYearsViewRepository, SalesPersonSalesByFiscalYearsView,
                                         Integer> {

    /**
     * Creates a new instance.
     */
    SalesPersonSalesByFiscalYearsViewRepository_SpringBootIT() {
        super(SalesPersonSalesByFiscalYearsViewRepository.class, SalesPersonSalesByFiscalYearsView.class,
              Integer.class);
    }
}
