package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.person.BusinessEntityAddressId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.BusinessEntityAddress;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data.BusinessEntityAddressRepository;

/**
 * Tests {@link BusinessEntityAddressRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class BusinessEntityAddressRepository_SpringBootIT
        extends _Repository_SpringBootIT<BusinessEntityAddressRepository, BusinessEntityAddress,
                                         BusinessEntityAddressId> {

    /**
     * Creates a new instance.
     */
    BusinessEntityAddressRepository_SpringBootIT() {
        super(BusinessEntityAddressRepository.class, BusinessEntityAddress.class, BusinessEntityAddressId.class);
    }
}
