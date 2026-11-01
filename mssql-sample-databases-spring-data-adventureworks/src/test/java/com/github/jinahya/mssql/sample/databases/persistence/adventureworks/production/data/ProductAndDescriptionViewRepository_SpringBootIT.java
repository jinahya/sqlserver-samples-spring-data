package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.production.MappedProductAndDescriptionViewId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductAndDescriptionView;

/**
 * Tests {@link ProductAndDescriptionViewRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ProductAndDescriptionViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<ProductAndDescriptionViewRepository, ProductAndDescriptionView,
                                         MappedProductAndDescriptionViewId> {

    /**
     * Creates a new instance.
     */
    ProductAndDescriptionViewRepository_SpringBootIT() {
        super(ProductAndDescriptionViewRepository.class, ProductAndDescriptionView.class,
              MappedProductAndDescriptionViewId.class);
    }
}
