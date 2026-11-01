package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.Store;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Store}, the {@code Sales.Store} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Store
 */
@Repository
public interface StoreRepository
        extends _Repository<Store, Integer> {

}
