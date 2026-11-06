package com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.purchasing.ProductVendorId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.ProductVendor;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.data.ProductVendorRepository;

/**
 * Tests {@link ProductVendorRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ProductVendorRepository_SpringBootIT
        extends _Repository_SpringBootIT<ProductVendorRepository, ProductVendor, ProductVendorId> {

    /**
     * Creates a new instance.
     */
    ProductVendorRepository_SpringBootIT() {
        super(ProductVendorRepository.class, ProductVendor.class, ProductVendorId.class);
    }
}
