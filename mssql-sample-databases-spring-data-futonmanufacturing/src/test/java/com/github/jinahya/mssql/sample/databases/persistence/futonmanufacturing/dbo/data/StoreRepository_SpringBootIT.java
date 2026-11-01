package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.Store;

/**
 * Tests {@link StoreRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
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
