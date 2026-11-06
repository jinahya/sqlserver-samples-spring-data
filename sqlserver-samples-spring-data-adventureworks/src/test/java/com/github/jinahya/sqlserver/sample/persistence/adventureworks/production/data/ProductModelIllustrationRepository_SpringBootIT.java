package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.ProductModelIllustrationId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductModelIllustration;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.ProductModelIllustrationRepository;

/**
 * Tests {@link ProductModelIllustrationRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ProductModelIllustrationRepository_SpringBootIT
        extends _Repository_SpringBootIT<ProductModelIllustrationRepository, ProductModelIllustration,
                                         ProductModelIllustrationId> {

    /**
     * Creates a new instance.
     */
    ProductModelIllustrationRepository_SpringBootIT() {
        super(ProductModelIllustrationRepository.class, ProductModelIllustration.class,
              ProductModelIllustrationId.class);
    }
}
