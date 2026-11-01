package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.warehouse.ColdRoomTemperature;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ColdRoomTemperature}, the {@code Warehouse.ColdRoomTemperatures} table of WideWorldImporters.
 * <p>
 * The id is {@link Long}.
 *
 * @see ColdRoomTemperature
 */
@Repository
public interface ColdRoomTemperatureRepository
        extends _Repository<ColdRoomTemperature, Long> {

}
