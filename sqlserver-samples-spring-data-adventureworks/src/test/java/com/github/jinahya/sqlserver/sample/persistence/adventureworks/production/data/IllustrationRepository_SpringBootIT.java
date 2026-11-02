package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.Illustration;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.IllustrationRepository;

/**
 * Tests {@link IllustrationRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class IllustrationRepository_SpringBootIT
        extends _Repository_SpringBootIT<IllustrationRepository, Illustration, Integer> {

    /**
     * Creates a new instance.
     */
    IllustrationRepository_SpringBootIT() {
        super(IllustrationRepository.class, Illustration.class, Integer.class);
    }
}
