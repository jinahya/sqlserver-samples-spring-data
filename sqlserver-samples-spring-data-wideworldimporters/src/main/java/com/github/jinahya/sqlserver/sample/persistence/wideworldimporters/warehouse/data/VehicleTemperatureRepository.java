package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.VehicleTemperature;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link VehicleTemperature}, the {@code Warehouse.VehicleTemperatures} table of WideWorldImporters.
 * <p>
 * The id is {@link Long}.
 * <p>
 * The bean is named {@code warehouseVehicleTemperatureRepository}, not after the interface: another schema of this
 * module has a {@code VehicleTemperatureRepository} too, and Spring Data names a repository bean after its simple name.
 *
 * @see VehicleTemperature
 */
@Repository("warehouseVehicleTemperatureRepository")
public interface VehicleTemperatureRepository
        extends _Repository<VehicleTemperature, Long> {

}
