package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.person.MappedBusinessEntityAddressId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.BusinessEntityAddress;

/**
 * Tests {@link BusinessEntityAddressRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class BusinessEntityAddressRepository_SpringBootIT
        extends _Repository_SpringBootIT<BusinessEntityAddressRepository, BusinessEntityAddress,
                                         MappedBusinessEntityAddressId> {

    /**
     * Creates a new instance.
     */
    BusinessEntityAddressRepository_SpringBootIT() {
        super(BusinessEntityAddressRepository.class, BusinessEntityAddress.class, MappedBusinessEntityAddressId.class);
    }
}
