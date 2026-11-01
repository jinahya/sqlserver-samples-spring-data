package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.Warehouse;

/**
 * Tests {@link WarehouseRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class WarehouseRepository_SpringBootIT
        extends _Repository_SpringBootIT<WarehouseRepository, Warehouse, Integer> {

    /**
     * Creates a new instance.
     */
    WarehouseRepository_SpringBootIT() {
        super(WarehouseRepository.class, Warehouse.class, Integer.class);
    }
}
