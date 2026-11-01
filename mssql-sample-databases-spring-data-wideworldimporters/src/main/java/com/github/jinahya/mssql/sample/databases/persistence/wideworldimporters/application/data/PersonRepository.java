package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.Person;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Person}, the {@code Application.People} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Person
 */
@Repository
public interface PersonRepository
        extends _Repository<Person, Integer> {

}
