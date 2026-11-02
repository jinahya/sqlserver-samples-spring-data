package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.ProductionOrder;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ProductionOrder}, the {@code dbo.ProductionOrder} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see ProductionOrder
 */
@Repository
public interface ProductionOrderRepository
        extends _Repository<ProductionOrder, Integer> {

}
