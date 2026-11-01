package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.StoreWithDemographicsView;

/**
 * Tests {@link StoreWithDemographicsViewRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class StoreWithDemographicsViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<StoreWithDemographicsViewRepository, StoreWithDemographicsView, Integer> {

    /**
     * Creates a new instance.
     */
    StoreWithDemographicsViewRepository_SpringBootIT() {
        super(StoreWithDemographicsViewRepository.class, StoreWithDemographicsView.class, Integer.class);
    }
}
