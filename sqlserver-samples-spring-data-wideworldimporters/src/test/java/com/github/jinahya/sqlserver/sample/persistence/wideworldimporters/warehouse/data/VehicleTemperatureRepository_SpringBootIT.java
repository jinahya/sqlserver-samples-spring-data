package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.VehicleTemperature;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.data.VehicleTemperatureRepository;

/**
 * Tests {@link VehicleTemperatureRepository} against WideWorldImporters, through
 * {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class VehicleTemperatureRepository_SpringBootIT
        extends _Repository_SpringBootIT<VehicleTemperatureRepository, VehicleTemperature, Long> {

    /**
     * Creates a new instance.
     */
    VehicleTemperatureRepository_SpringBootIT() {
        super(VehicleTemperatureRepository.class, VehicleTemperature.class, Long.class);
    }
}
