package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.StateProvince;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data.StateProvinceRepository;

/**
 * Tests {@link StateProvinceRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class StateProvinceRepository_SpringBootIT
        extends _Repository_SpringBootIT<StateProvinceRepository, StateProvince, Integer> {

    /**
     * Creates a new instance.
     */
    StateProvinceRepository_SpringBootIT() {
        super(StateProvinceRepository.class, StateProvince.class, Integer.class);
    }
}
