package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.Inventory;

/**
 * Tests {@link InventoryRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class InventoryRepository_SpringBootIT
        extends _Repository_SpringBootIT<InventoryRepository, Inventory, Integer> {

    /**
     * Creates a new instance.
     */
    InventoryRepository_SpringBootIT() {
        super(InventoryRepository.class, Inventory.class, Integer.class);
    }
}
