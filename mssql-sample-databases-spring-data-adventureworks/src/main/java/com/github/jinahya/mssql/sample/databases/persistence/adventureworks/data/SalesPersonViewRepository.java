package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SalesPersonView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesPersonView}, the {@code Sales.vSalesPerson} view of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SalesPersonView
 */
@Repository
public interface SalesPersonViewRepository
        extends _Repository<SalesPersonView, Integer> {

}
