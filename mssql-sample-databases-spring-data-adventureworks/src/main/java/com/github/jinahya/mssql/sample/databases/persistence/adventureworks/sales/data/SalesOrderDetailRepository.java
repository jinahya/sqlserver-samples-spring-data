package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.sales.MappedSalesOrderDetailId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SalesOrderDetail;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesOrderDetail}, the {@code Sales.SalesOrderDetail} table of AdventureWorks.
 * <p>
 * The id is {@link MappedSalesOrderDetailId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see SalesOrderDetail
 */
@Repository
public interface SalesOrderDetailRepository
        extends _Repository<SalesOrderDetail, MappedSalesOrderDetailId> {

}
