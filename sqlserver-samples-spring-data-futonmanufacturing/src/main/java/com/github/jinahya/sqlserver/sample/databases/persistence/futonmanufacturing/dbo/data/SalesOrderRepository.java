package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesOrder;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesOrder}, the {@code dbo.SalesOrder} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SalesOrder
 */
@Repository
public interface SalesOrderRepository
        extends _Repository<SalesOrder, Integer> {

}
