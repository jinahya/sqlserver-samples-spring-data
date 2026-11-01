package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.warehouse.ColdRoomTemperature;

/**
 * Tests {@link ColdRoomTemperatureRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class ColdRoomTemperatureRepository_SpringBootIT
        extends _Repository_SpringBootIT<ColdRoomTemperatureRepository, ColdRoomTemperature, Long> {

    /**
     * Creates a new instance.
     */
    ColdRoomTemperatureRepository_SpringBootIT() {
        super(ColdRoomTemperatureRepository.class, ColdRoomTemperature.class, Long.class);
    }
}
