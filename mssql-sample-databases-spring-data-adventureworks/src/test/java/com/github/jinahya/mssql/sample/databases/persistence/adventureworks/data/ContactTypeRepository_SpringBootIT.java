package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.ContactType;

/**
 * Tests {@link ContactTypeRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ContactTypeRepository_SpringBootIT
        extends _Repository_SpringBootIT<ContactTypeRepository, ContactType, Integer> {

    /**
     * Creates a new instance.
     */
    ContactTypeRepository_SpringBootIT() {
        super(ContactTypeRepository.class, ContactType.class, Integer.class);
    }
}
