package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.production.MappedProductModelProductDescriptionCultureId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductModelProductDescriptionCulture;

/**
 * Tests {@link ProductModelProductDescriptionCultureRepository} against AdventureWorks, through
 * {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ProductModelProductDescriptionCultureRepository_SpringBootIT
        extends _Repository_SpringBootIT<ProductModelProductDescriptionCultureRepository,
                                         ProductModelProductDescriptionCulture,
                                         MappedProductModelProductDescriptionCultureId> {

    /**
     * Creates a new instance.
     */
    ProductModelProductDescriptionCultureRepository_SpringBootIT() {
        super(ProductModelProductDescriptionCultureRepository.class, ProductModelProductDescriptionCulture.class,
              MappedProductModelProductDescriptionCultureId.class);
    }
}
