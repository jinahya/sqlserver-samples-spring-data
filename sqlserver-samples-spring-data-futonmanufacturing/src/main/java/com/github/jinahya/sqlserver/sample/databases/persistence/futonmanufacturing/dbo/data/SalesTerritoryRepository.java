package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesTerritory;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesTerritory}, the {@code dbo.SalesTerritory} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SalesTerritory
 */
@Repository
public interface SalesTerritoryRepository
        extends _Repository<SalesTerritory, Integer> {

}
