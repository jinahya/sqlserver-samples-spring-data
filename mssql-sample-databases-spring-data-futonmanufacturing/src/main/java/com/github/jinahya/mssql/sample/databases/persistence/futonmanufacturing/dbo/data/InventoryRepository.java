package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.Inventory;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Inventory}, the {@code dbo.Inventory} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Inventory
 */
@Repository
public interface InventoryRepository
        extends _Repository<Inventory, Integer> {

}
