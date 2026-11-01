package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesOrderBacklogView;

/**
 * Tests {@link SalesOrderBacklogViewRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class SalesOrderBacklogViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesOrderBacklogViewRepository, SalesOrderBacklogView, String> {

    /**
     * Creates a new instance.
     */
    SalesOrderBacklogViewRepository_SpringBootIT() {
        super(SalesOrderBacklogViewRepository.class, SalesOrderBacklogView.class, String.class);
    }
}
