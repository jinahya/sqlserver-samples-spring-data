package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.person.PersonPhoneId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.PersonPhone;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data.PersonPhoneRepository;

/**
 * Tests {@link PersonPhoneRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class PersonPhoneRepository_SpringBootIT
        extends _Repository_SpringBootIT<PersonPhoneRepository, PersonPhone, PersonPhoneId> {

    /**
     * Creates a new instance.
     */
    PersonPhoneRepository_SpringBootIT() {
        super(PersonPhoneRepository.class, PersonPhone.class, PersonPhoneId.class);
    }
}
