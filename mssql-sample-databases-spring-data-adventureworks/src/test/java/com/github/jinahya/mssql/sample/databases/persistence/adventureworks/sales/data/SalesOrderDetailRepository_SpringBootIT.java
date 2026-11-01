package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.sales.MappedSalesOrderDetailId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SalesOrderDetail;

/**
 * Tests {@link SalesOrderDetailRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class SalesOrderDetailRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesOrderDetailRepository, SalesOrderDetail, MappedSalesOrderDetailId> {

    /**
     * Creates a new instance.
     */
    SalesOrderDetailRepository_SpringBootIT() {
        super(SalesOrderDetailRepository.class, SalesOrderDetail.class, MappedSalesOrderDetailId.class);
    }
}
