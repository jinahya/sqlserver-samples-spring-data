package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductDescription;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.ProductDescriptionRepository;

/**
 * Tests {@link ProductDescriptionRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ProductDescriptionRepository_SpringBootIT
        extends _Repository_SpringBootIT<ProductDescriptionRepository, ProductDescription, Integer> {

    /**
     * Creates a new instance.
     */
    ProductDescriptionRepository_SpringBootIT() {
        super(ProductDescriptionRepository.class, ProductDescription.class, Integer.class);
    }
}
