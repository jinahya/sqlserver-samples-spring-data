package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.Supplier;

/**
 * Tests {@link SupplierRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class SupplierRepository_SpringBootIT
        extends _Repository_SpringBootIT<SupplierRepository, Supplier, Integer> {

    /**
     * Creates a new instance.
     */
    SupplierRepository_SpringBootIT() {
        super(SupplierRepository.class, Supplier.class, Integer.class);
    }
}
