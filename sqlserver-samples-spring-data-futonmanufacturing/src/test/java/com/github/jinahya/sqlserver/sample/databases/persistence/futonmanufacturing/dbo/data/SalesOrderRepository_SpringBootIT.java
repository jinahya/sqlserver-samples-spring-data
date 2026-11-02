package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesOrder;

/**
 * Tests {@link SalesOrderRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class SalesOrderRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesOrderRepository, SalesOrder, Integer> {

    /**
     * Creates a new instance.
     */
    SalesOrderRepository_SpringBootIT() {
        super(SalesOrderRepository.class, SalesOrder.class, Integer.class);
    }
}
