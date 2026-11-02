package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SupplierItem;

/**
 * Tests {@link SupplierItemRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class SupplierItemRepository_SpringBootIT
        extends _Repository_SpringBootIT<SupplierItemRepository, SupplierItem, Integer> {

    /**
     * Creates a new instance.
     */
    SupplierItemRepository_SpringBootIT() {
        super(SupplierItemRepository.class, SupplierItem.class, Integer.class);
    }
}
