package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.Warehouse;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Warehouse}, the {@code dbo.Warehouse} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Warehouse
 */
@Repository
public interface WarehouseRepository
        extends _Repository<Warehouse, Integer> {

}
