package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.website.VehicleTemperature;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link VehicleTemperature}, the {@code Website.VehicleTemperatures} view of WideWorldImporters.
 * <p>
 * The id is {@link Long}.
 *
 * @see VehicleTemperature
 */
@Repository
public interface WebsiteVehicleTemperatureRepository
        extends _Repository<VehicleTemperature, Long> {

}
