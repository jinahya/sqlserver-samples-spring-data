package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.Item;

/**
 * Tests {@link ItemRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class ItemRepository_SpringBootIT
        extends _Repository_SpringBootIT<ItemRepository, Item, Integer> {

    /**
     * Creates a new instance.
     */
    ItemRepository_SpringBootIT() {
        super(ItemRepository.class, Item.class, Integer.class);
    }
}
