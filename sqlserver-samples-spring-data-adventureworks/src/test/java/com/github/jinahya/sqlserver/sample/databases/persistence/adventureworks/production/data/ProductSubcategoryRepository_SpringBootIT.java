package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.ProductSubcategory;

/**
 * Tests {@link ProductSubcategoryRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ProductSubcategoryRepository_SpringBootIT
        extends _Repository_SpringBootIT<ProductSubcategoryRepository, ProductSubcategory, Integer> {

    /**
     * Creates a new instance.
     */
    ProductSubcategoryRepository_SpringBootIT() {
        super(ProductSubcategoryRepository.class, ProductSubcategory.class, Integer.class);
    }
}
