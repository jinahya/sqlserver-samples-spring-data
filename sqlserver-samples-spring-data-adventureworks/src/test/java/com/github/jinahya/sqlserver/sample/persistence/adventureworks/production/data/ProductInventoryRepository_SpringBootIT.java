package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.ProductInventoryId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductInventory;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.ProductInventoryRepository;

/**
 * Tests {@link ProductInventoryRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ProductInventoryRepository_SpringBootIT
        extends _Repository_SpringBootIT<ProductInventoryRepository, ProductInventory, ProductInventoryId> {

    /**
     * Creates a new instance.
     */
    ProductInventoryRepository_SpringBootIT() {
        super(ProductInventoryRepository.class, ProductInventory.class, ProductInventoryId.class);
    }
}
