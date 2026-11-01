package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.production.MappedProductInventoryId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductInventory;

/**
 * Tests {@link ProductInventoryRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ProductInventoryRepository_SpringBootIT
        extends _Repository_SpringBootIT<ProductInventoryRepository, ProductInventory, MappedProductInventoryId> {

    /**
     * Creates a new instance.
     */
    ProductInventoryRepository_SpringBootIT() {
        super(ProductInventoryRepository.class, ProductInventory.class, MappedProductInventoryId.class);
    }
}
