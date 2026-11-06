package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.SalesOrderDetailId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SalesOrderDetail;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesOrderDetail}, the {@code Sales.SalesOrderDetail} table of AdventureWorks.
 * <p>
 * The id is {@link SalesOrderDetailId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see SalesOrderDetail
 */
@Repository
public interface SalesOrderDetailRepository
        extends _Repository<SalesOrderDetail, SalesOrderDetailId> {

}
