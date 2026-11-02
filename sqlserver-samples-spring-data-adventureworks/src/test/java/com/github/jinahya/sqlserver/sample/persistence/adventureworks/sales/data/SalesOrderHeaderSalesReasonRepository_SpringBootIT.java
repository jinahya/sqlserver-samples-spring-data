package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.MappedSalesOrderHeaderSalesReasonId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SalesOrderHeaderSalesReason;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data.SalesOrderHeaderSalesReasonRepository;

/**
 * Tests {@link SalesOrderHeaderSalesReasonRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class SalesOrderHeaderSalesReasonRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesOrderHeaderSalesReasonRepository, SalesOrderHeaderSalesReason,
                                         MappedSalesOrderHeaderSalesReasonId> {

    /**
     * Creates a new instance.
     */
    SalesOrderHeaderSalesReasonRepository_SpringBootIT() {
        super(SalesOrderHeaderSalesReasonRepository.class, SalesOrderHeaderSalesReason.class,
              MappedSalesOrderHeaderSalesReasonId.class);
    }
}
