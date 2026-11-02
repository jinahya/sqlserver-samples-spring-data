package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.application.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.application.StateProvince;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository_SpringBootIT;

/**
 * Tests {@link StateProvinceRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
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
