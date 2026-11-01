package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.AddressType;

/**
 * Tests {@link AddressTypeRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class AddressTypeRepository_SpringBootIT
        extends _Repository_SpringBootIT<AddressTypeRepository, AddressType, Integer> {

    /**
     * Creates a new instance.
     */
    AddressTypeRepository_SpringBootIT() {
        super(AddressTypeRepository.class, AddressType.class, Integer.class);
    }
}
