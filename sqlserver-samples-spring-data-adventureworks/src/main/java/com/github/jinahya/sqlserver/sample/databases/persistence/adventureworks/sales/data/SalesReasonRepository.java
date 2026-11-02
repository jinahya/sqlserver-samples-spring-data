package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.SalesReason;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesReason}, the {@code Sales.SalesReason} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SalesReason
 */
@Repository
public interface SalesReasonRepository
        extends _Repository<SalesReason, Integer> {

}
