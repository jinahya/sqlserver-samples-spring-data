package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductPhoto;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.ProductPhotoRepository;

/**
 * Tests {@link ProductPhotoRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ProductPhotoRepository_SpringBootIT
        extends _Repository_SpringBootIT<ProductPhotoRepository, ProductPhoto, Integer> {

    /**
     * Creates a new instance.
     */
    ProductPhotoRepository_SpringBootIT() {
        super(ProductPhotoRepository.class, ProductPhoto.class, Integer.class);
    }
}
