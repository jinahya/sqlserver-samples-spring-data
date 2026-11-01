package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.Password;

/**
 * Tests {@link PasswordRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class PasswordRepository_SpringBootIT
        extends _Repository_SpringBootIT<PasswordRepository, Password, Integer> {

    /**
     * Creates a new instance.
     */
    PasswordRepository_SpringBootIT() {
        super(PasswordRepository.class, Password.class, Integer.class);
    }
}
