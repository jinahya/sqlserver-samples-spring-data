package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.application.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.application.SystemParameter;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository_SpringBootIT;

/**
 * Tests {@link SystemParameterRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class SystemParameterRepository_SpringBootIT
        extends _Repository_SpringBootIT<SystemParameterRepository, SystemParameter, Integer> {

    /**
     * Creates a new instance.
     */
    SystemParameterRepository_SpringBootIT() {
        super(SystemParameterRepository.class, SystemParameter.class, Integer.class);
    }
}
