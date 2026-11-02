package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.Person;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data.PersonRepository;

/**
 * Tests {@link PersonRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class PersonRepository_SpringBootIT
        extends _Repository_SpringBootIT<PersonRepository, Person, Integer> {

    /**
     * Creates a new instance.
     */
    PersonRepository_SpringBootIT() {
        super(PersonRepository.class, Person.class, Integer.class);
    }
}
