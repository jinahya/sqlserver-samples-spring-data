package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SalesOrderHeader;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesOrderHeader}, the {@code Sales.SalesOrderHeader} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SalesOrderHeader
 */
@Repository
public interface SalesOrderHeaderRepository
        extends _Repository<SalesOrderHeader, Integer> {

}
