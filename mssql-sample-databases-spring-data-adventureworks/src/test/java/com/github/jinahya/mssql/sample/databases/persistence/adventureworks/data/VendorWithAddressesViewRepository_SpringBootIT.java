package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.purchasing.VendorWithAddressesView;

/**
 * Tests {@link VendorWithAddressesViewRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class VendorWithAddressesViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<VendorWithAddressesViewRepository, VendorWithAddressesView, Integer> {

    /**
     * Creates a new instance.
     */
    VendorWithAddressesViewRepository_SpringBootIT() {
        super(VendorWithAddressesViewRepository.class, VendorWithAddressesView.class, Integer.class);
    }
}
