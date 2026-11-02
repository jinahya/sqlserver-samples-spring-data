package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.ProductCategory;

/**
 * Tests {@link ProductCategoryRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ProductCategoryRepository_SpringBootIT
        extends _Repository_SpringBootIT<ProductCategoryRepository, ProductCategory, Integer> {

    /**
     * Creates a new instance.
     */
    ProductCategoryRepository_SpringBootIT() {
        super(ProductCategoryRepository.class, ProductCategory.class, Integer.class);
    }
}
