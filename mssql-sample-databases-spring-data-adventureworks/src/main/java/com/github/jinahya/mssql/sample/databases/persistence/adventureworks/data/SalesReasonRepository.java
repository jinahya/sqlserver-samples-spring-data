package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SalesReason;
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
