package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.warehouse.VehicleTemperature;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link VehicleTemperature}, the {@code Warehouse.VehicleTemperatures} table of WideWorldImporters.
 * <p>
 * The id is {@link Long}.
 *
 * @see VehicleTemperature
 */
@Repository
public interface WarehouseVehicleTemperatureRepository
        extends _Repository<VehicleTemperature, Long> {

}
