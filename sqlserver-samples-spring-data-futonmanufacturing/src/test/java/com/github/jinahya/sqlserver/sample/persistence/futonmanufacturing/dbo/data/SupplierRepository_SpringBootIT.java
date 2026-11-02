package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.Supplier;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.SupplierRepository;

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
