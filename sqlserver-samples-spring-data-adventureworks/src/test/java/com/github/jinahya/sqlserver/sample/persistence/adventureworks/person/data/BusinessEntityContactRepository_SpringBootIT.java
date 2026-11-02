package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.person.MappedBusinessEntityContactId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.BusinessEntityContact;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data.BusinessEntityContactRepository;

/**
 * Tests {@link BusinessEntityContactRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class BusinessEntityContactRepository_SpringBootIT
        extends _Repository_SpringBootIT<BusinessEntityContactRepository, BusinessEntityContact,
                                         MappedBusinessEntityContactId> {

    /**
     * Creates a new instance.
     */
    BusinessEntityContactRepository_SpringBootIT() {
        super(BusinessEntityContactRepository.class, BusinessEntityContact.class, MappedBusinessEntityContactId.class);
    }
}
