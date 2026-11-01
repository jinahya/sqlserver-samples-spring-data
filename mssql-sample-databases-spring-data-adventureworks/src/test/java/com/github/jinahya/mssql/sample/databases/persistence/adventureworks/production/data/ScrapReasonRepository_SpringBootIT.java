package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ScrapReason;

/**
 * Tests {@link ScrapReasonRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ScrapReasonRepository_SpringBootIT
        extends _Repository_SpringBootIT<ScrapReasonRepository, ScrapReason, Short> {

    /**
     * Creates a new instance.
     */
    ScrapReasonRepository_SpringBootIT() {
        super(ScrapReasonRepository.class, ScrapReason.class, Short.class);
    }
}
