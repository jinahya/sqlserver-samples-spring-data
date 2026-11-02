package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.MappedProductProductPhotoId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductProductPhoto;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.ProductProductPhotoRepository;

/**
 * Tests {@link ProductProductPhotoRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ProductProductPhotoRepository_SpringBootIT
        extends _Repository_SpringBootIT<ProductProductPhotoRepository, ProductProductPhoto,
                                         MappedProductProductPhotoId> {

    /**
     * Creates a new instance.
     */
    ProductProductPhotoRepository_SpringBootIT() {
        super(ProductProductPhotoRepository.class, ProductProductPhoto.class, MappedProductProductPhotoId.class);
    }
}
