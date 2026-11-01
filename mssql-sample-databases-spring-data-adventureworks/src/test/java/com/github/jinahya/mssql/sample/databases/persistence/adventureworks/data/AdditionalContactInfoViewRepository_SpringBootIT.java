package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.AdditionalContactInfoView;

/**
 * Tests {@link AdditionalContactInfoViewRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class AdditionalContactInfoViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<AdditionalContactInfoViewRepository, AdditionalContactInfoView, Integer> {

    /**
     * Creates a new instance.
     */
    AdditionalContactInfoViewRepository_SpringBootIT() {
        super(AdditionalContactInfoViewRepository.class, AdditionalContactInfoView.class, Integer.class);
    }
}
