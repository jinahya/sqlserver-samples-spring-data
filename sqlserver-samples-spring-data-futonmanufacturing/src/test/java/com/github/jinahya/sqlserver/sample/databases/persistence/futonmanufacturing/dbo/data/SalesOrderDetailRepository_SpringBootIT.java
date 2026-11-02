package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesOrderDetail;

/**
 * Tests {@link SalesOrderDetailRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class SalesOrderDetailRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesOrderDetailRepository, SalesOrderDetail, Integer> {

    /**
     * Creates a new instance.
     */
    SalesOrderDetailRepository_SpringBootIT() {
        super(SalesOrderDetailRepository.class, SalesOrderDetail.class, Integer.class);
    }
}
