package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.SalesOrderDetailId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SalesOrderDetail;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data.SalesOrderDetailRepository;

/**
 * Tests {@link SalesOrderDetailRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class SalesOrderDetailRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesOrderDetailRepository, SalesOrderDetail, SalesOrderDetailId> {

    /**
     * Creates a new instance.
     */
    SalesOrderDetailRepository_SpringBootIT() {
        super(SalesOrderDetailRepository.class, SalesOrderDetail.class, SalesOrderDetailId.class);
    }
}
