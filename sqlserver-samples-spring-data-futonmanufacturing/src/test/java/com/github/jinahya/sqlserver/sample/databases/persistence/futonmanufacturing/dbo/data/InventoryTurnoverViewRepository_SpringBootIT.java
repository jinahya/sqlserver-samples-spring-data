package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.InventoryTurnoverView;

/**
 * Tests {@link InventoryTurnoverViewRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class InventoryTurnoverViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<InventoryTurnoverViewRepository, InventoryTurnoverView, String> {

    /**
     * Creates a new instance.
     */
    InventoryTurnoverViewRepository_SpringBootIT() {
        super(InventoryTurnoverViewRepository.class, InventoryTurnoverView.class, String.class);
    }
}
