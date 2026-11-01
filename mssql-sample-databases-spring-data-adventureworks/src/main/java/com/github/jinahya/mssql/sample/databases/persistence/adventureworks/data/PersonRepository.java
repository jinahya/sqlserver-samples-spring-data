package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.Person;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Person}, the {@code Person.Person} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Person
 */
@Repository
public interface PersonRepository
        extends _Repository<Person, Integer> {

}
