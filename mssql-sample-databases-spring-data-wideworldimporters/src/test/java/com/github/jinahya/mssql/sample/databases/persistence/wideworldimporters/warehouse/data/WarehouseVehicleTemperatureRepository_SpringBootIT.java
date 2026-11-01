package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.warehouse.VehicleTemperature;

/**
 * Tests {@link WarehouseVehicleTemperatureRepository} against WideWorldImporters, through
 * {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class WarehouseVehicleTemperatureRepository_SpringBootIT
        extends _Repository_SpringBootIT<WarehouseVehicleTemperatureRepository, VehicleTemperature, Long> {

    /**
     * Creates a new instance.
     */
    WarehouseVehicleTemperatureRepository_SpringBootIT() {
        super(WarehouseVehicleTemperatureRepository.class, VehicleTemperature.class, Long.class);
    }
}
