package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.website.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.website.VehicleTemperature;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link VehicleTemperature}, the {@code Website.VehicleTemperatures} view of WideWorldImporters.
 * <p>
 * The id is {@link Long}.
 * <p>
 * The bean is named {@code websiteVehicleTemperatureRepository}, not after the interface: another schema of this module
 * has a {@code VehicleTemperatureRepository} too, and Spring Data names a repository bean after its simple name.
 *
 * @see VehicleTemperature
 */
@Repository("websiteVehicleTemperatureRepository")
public interface VehicleTemperatureRepository
        extends _Repository<VehicleTemperature, Long> {

}
