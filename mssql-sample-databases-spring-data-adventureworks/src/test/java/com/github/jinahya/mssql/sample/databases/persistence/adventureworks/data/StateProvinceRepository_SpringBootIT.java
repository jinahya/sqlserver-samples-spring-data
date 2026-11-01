package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.StateProvince;

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
