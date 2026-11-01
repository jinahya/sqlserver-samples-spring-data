package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.production.MappedProductModelIllustrationId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductModelIllustration;

/**
 * Tests {@link ProductModelIllustrationRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ProductModelIllustrationRepository_SpringBootIT
        extends _Repository_SpringBootIT<ProductModelIllustrationRepository, ProductModelIllustration,
                                         MappedProductModelIllustrationId> {

    /**
     * Creates a new instance.
     */
    ProductModelIllustrationRepository_SpringBootIT() {
        super(ProductModelIllustrationRepository.class, ProductModelIllustration.class,
              MappedProductModelIllustrationId.class);
    }
}
