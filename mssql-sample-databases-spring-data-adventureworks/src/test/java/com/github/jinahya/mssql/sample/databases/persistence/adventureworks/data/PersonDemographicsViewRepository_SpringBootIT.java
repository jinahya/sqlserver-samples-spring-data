package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.PersonDemographicsView;

/**
 * Tests {@link PersonDemographicsViewRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class PersonDemographicsViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<PersonDemographicsViewRepository, PersonDemographicsView, Integer> {

    /**
     * Creates a new instance.
     */
    PersonDemographicsViewRepository_SpringBootIT() {
        super(PersonDemographicsViewRepository.class, PersonDemographicsView.class, Integer.class);
    }
}
