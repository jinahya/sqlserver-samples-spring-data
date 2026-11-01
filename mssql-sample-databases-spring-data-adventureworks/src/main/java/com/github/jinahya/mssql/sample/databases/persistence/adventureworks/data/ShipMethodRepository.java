package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.purchasing.ShipMethod;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ShipMethod}, the {@code Purchasing.ShipMethod} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see ShipMethod
 */
@Repository
public interface ShipMethodRepository
        extends _Repository<ShipMethod, Integer> {

}
