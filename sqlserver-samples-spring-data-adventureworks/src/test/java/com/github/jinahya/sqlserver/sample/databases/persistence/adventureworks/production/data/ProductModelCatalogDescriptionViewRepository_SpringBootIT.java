package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.ProductModelCatalogDescriptionView;

/**
 * Tests {@link ProductModelCatalogDescriptionViewRepository} against AdventureWorks, through
 * {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ProductModelCatalogDescriptionViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<ProductModelCatalogDescriptionViewRepository,
                                         ProductModelCatalogDescriptionView, Integer> {

    /**
     * Creates a new instance.
     */
    ProductModelCatalogDescriptionViewRepository_SpringBootIT() {
        super(ProductModelCatalogDescriptionViewRepository.class, ProductModelCatalogDescriptionView.class,
              Integer.class);
    }
}
