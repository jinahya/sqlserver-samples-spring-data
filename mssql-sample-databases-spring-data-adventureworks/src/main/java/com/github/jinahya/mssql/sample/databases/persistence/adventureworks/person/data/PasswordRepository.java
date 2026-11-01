package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.Password;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Password}, the {@code Person.Password} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Password
 */
@Repository
public interface PasswordRepository
        extends _Repository<Password, Integer> {

}
