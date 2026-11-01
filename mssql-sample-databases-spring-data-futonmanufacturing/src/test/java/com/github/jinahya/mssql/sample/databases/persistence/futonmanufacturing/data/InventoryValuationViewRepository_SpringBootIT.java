package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.InventoryValuationView;

/**
 * Tests {@link InventoryValuationViewRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class InventoryValuationViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<InventoryValuationViewRepository, InventoryValuationView, String> {

    /**
     * Creates a new instance.
     */
    InventoryValuationViewRepository_SpringBootIT() {
        super(InventoryValuationViewRepository.class, InventoryValuationView.class, String.class);
    }
}
