package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.PersonDemographicsView;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data.PersonDemographicsViewRepository;

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
