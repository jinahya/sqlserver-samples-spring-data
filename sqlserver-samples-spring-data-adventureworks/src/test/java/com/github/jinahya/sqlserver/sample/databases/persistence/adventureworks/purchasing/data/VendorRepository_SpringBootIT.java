package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.purchasing.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.purchasing.Vendor;

/**
 * Tests {@link VendorRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class VendorRepository_SpringBootIT
        extends _Repository_SpringBootIT<VendorRepository, Vendor, Integer> {

    /**
     * Creates a new instance.
     */
    VendorRepository_SpringBootIT() {
        super(VendorRepository.class, Vendor.class, Integer.class);
    }
}
