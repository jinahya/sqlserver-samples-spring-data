package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.Address;

/**
 * Tests {@link AddressRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class AddressRepository_SpringBootIT
        extends _Repository_SpringBootIT<AddressRepository, Address, Integer> {

    /**
     * Creates a new instance.
     */
    AddressRepository_SpringBootIT() {
        super(AddressRepository.class, Address.class, Integer.class);
    }
}
