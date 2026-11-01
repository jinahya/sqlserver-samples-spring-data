package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.website.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.website.VehicleTemperature;

/**
 * Tests {@link WebsiteVehicleTemperatureRepository} against WideWorldImporters, through
 * {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class WebsiteVehicleTemperatureRepository_SpringBootIT
        extends _Repository_SpringBootIT<WebsiteVehicleTemperatureRepository, VehicleTemperature, Long> {

    /**
     * Creates a new instance.
     */
    WebsiteVehicleTemperatureRepository_SpringBootIT() {
        super(WebsiteVehicleTemperatureRepository.class, VehicleTemperature.class, Long.class);
    }
}
