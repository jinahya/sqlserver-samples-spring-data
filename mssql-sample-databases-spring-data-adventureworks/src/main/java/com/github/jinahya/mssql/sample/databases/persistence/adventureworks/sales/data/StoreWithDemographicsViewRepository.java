package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.StoreWithDemographicsView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link StoreWithDemographicsView}, the {@code Sales.vStoreWithDemographics} view of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see StoreWithDemographicsView
 */
@Repository
public interface StoreWithDemographicsViewRepository
        extends _Repository<StoreWithDemographicsView, Integer> {

}
