package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.Culture;

/**
 * Tests {@link CultureRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class CultureRepository_SpringBootIT
        extends _Repository_SpringBootIT<CultureRepository, Culture, String> {

    /**
     * Creates a new instance.
     */
    CultureRepository_SpringBootIT() {
        super(CultureRepository.class, Culture.class, String.class);
    }
}
