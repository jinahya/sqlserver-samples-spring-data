package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.StateProvinceCountryRegionView;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data.StateProvinceCountryRegionViewRepository;

/**
 * Tests {@link StateProvinceCountryRegionViewRepository} against AdventureWorks, through
 * {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class StateProvinceCountryRegionViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<StateProvinceCountryRegionViewRepository, StateProvinceCountryRegionView,
                                         Integer> {

    /**
     * Creates a new instance.
     */
    StateProvinceCountryRegionViewRepository_SpringBootIT() {
        super(StateProvinceCountryRegionViewRepository.class, StateProvinceCountryRegionView.class, Integer.class);
    }
}
