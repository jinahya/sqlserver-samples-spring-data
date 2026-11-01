package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductPhoto;

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
