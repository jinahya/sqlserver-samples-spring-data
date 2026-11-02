package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.Store;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data.StoreRepository;

/**
 * Tests {@link StoreRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class StoreRepository_SpringBootIT
        extends _Repository_SpringBootIT<StoreRepository, Store, Integer> {

    /**
     * Creates a new instance.
     */
    StoreRepository_SpringBootIT() {
        super(StoreRepository.class, Store.class, Integer.class);
    }
}
