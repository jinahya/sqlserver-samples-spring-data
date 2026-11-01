package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.person.MappedPersonPhoneId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.PersonPhone;

/**
 * Tests {@link PersonPhoneRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class PersonPhoneRepository_SpringBootIT
        extends _Repository_SpringBootIT<PersonPhoneRepository, PersonPhone, MappedPersonPhoneId> {

    /**
     * Creates a new instance.
     */
    PersonPhoneRepository_SpringBootIT() {
        super(PersonPhoneRepository.class, PersonPhone.class, MappedPersonPhoneId.class);
    }
}
