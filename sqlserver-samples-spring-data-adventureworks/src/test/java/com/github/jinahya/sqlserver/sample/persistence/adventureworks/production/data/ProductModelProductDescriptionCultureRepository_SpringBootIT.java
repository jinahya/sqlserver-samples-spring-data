package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.ProductModelProductDescriptionCultureId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductModelProductDescriptionCulture;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.ProductModelProductDescriptionCultureRepository;

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
                                         ProductModelProductDescriptionCultureId> {

    /**
     * Creates a new instance.
     */
    ProductModelProductDescriptionCultureRepository_SpringBootIT() {
        super(ProductModelProductDescriptionCultureRepository.class, ProductModelProductDescriptionCulture.class,
              ProductModelProductDescriptionCultureId.class);
    }
}
