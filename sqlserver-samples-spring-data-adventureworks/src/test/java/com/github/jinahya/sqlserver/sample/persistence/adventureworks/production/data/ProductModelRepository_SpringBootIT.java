package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductModel;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.ProductModelRepository;

/**
 * Tests {@link ProductModelRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ProductModelRepository_SpringBootIT
        extends _Repository_SpringBootIT<ProductModelRepository, ProductModel, Integer> {

    /**
     * Creates a new instance.
     */
    ProductModelRepository_SpringBootIT() {
        super(ProductModelRepository.class, ProductModel.class, Integer.class);
    }
}
