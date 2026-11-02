package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.SalesPersonView;
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
