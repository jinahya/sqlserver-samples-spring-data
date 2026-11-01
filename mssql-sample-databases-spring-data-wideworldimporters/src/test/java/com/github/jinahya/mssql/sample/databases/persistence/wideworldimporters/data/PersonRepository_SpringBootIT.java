package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.Person;

/**
 * Tests {@link PersonRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
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
