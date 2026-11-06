package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.SalesOrderHeaderSalesReasonId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SalesOrderHeaderSalesReason;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesOrderHeaderSalesReason}, the {@code Sales.SalesOrderHeaderSalesReason} table of
 * AdventureWorks.
 * <p>
 * The id is {@link SalesOrderHeaderSalesReasonId}, upstream's {@code @Embeddable} id class, which the entity maps with
 * {@code @EmbeddedId}.
 *
 * @see SalesOrderHeaderSalesReason
 */
@Repository
public interface SalesOrderHeaderSalesReasonRepository
        extends _Repository<SalesOrderHeaderSalesReason, SalesOrderHeaderSalesReasonId> {

}
