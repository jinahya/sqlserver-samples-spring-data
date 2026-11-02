package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.ColdRoomTemperature;
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
