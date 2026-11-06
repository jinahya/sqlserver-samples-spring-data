package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.person.EmailAddressId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.EmailAddress;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data.EmailAddressRepository;

/**
 * Tests {@link EmailAddressRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class EmailAddressRepository_SpringBootIT
        extends _Repository_SpringBootIT<EmailAddressRepository, EmailAddress, EmailAddressId> {

    /**
     * Creates a new instance.
     */
    EmailAddressRepository_SpringBootIT() {
        super(EmailAddressRepository.class, EmailAddress.class, EmailAddressId.class);
    }
}
