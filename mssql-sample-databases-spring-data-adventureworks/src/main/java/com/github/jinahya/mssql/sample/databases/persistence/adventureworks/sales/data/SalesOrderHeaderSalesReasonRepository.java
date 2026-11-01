package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.sales.MappedSalesOrderHeaderSalesReasonId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SalesOrderHeaderSalesReason;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesOrderHeaderSalesReason}, the {@code Sales.SalesOrderHeaderSalesReason} table of
 * AdventureWorks.
 * <p>
 * The id is {@link MappedSalesOrderHeaderSalesReasonId}, upstream's id class, which the entity names with {@code
 * @IdClass}.
 *
 * @see SalesOrderHeaderSalesReason
 */
@Repository
public interface SalesOrderHeaderSalesReasonRepository
        extends _Repository<SalesOrderHeaderSalesReason, MappedSalesOrderHeaderSalesReasonId> {

}
