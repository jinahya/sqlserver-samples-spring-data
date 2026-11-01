package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.ItemType;

/**
 * Tests {@link ItemTypeRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class ItemTypeRepository_SpringBootIT
        extends _Repository_SpringBootIT<ItemTypeRepository, ItemType, Integer> {

    /**
     * Creates a new instance.
     */
    ItemTypeRepository_SpringBootIT() {
        super(ItemTypeRepository.class, ItemType.class, Integer.class);
    }
}
