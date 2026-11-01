package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.ProductionCompletion;

/**
 * Tests {@link ProductionCompletionRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class ProductionCompletionRepository_SpringBootIT
        extends _Repository_SpringBootIT<ProductionCompletionRepository, ProductionCompletion, Integer> {

    /**
     * Creates a new instance.
     */
    ProductionCompletionRepository_SpringBootIT() {
        super(ProductionCompletionRepository.class, ProductionCompletion.class, Integer.class);
    }
}
