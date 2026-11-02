package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.purchasing.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.mapped.purchasing.MappedProductVendorId;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.purchasing.ProductVendor;

/**
 * Tests {@link ProductVendorRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ProductVendorRepository_SpringBootIT
        extends _Repository_SpringBootIT<ProductVendorRepository, ProductVendor, MappedProductVendorId> {

    /**
     * Creates a new instance.
     */
    ProductVendorRepository_SpringBootIT() {
        super(ProductVendorRepository.class, ProductVendor.class, MappedProductVendorId.class);
    }
}
