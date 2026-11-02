package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.ShoppingCartItem;

/**
 * Tests {@link ShoppingCartItemRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ShoppingCartItemRepository_SpringBootIT
        extends _Repository_SpringBootIT<ShoppingCartItemRepository, ShoppingCartItem, Integer> {

    /**
     * Creates a new instance.
     */
    ShoppingCartItemRepository_SpringBootIT() {
        super(ShoppingCartItemRepository.class, ShoppingCartItem.class, Integer.class);
    }
}
