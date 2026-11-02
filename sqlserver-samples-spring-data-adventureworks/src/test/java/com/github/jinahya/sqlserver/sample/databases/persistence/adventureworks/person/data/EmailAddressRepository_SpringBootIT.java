package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.mapped.person.MappedEmailAddressId;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.EmailAddress;

/**
 * Tests {@link EmailAddressRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class EmailAddressRepository_SpringBootIT
        extends _Repository_SpringBootIT<EmailAddressRepository, EmailAddress, MappedEmailAddressId> {

    /**
     * Creates a new instance.
     */
    EmailAddressRepository_SpringBootIT() {
        super(EmailAddressRepository.class, EmailAddress.class, MappedEmailAddressId.class);
    }
}
