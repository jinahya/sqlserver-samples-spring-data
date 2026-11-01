package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.Product;

/**
 * Tests {@link ProductRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ProductRepository_SpringBootIT
        extends _Repository_SpringBootIT<ProductRepository, Product, Integer> {

    /**
     * Creates a new instance.
     */
    ProductRepository_SpringBootIT() {
        super(ProductRepository.class, Product.class, Integer.class);
    }
}
