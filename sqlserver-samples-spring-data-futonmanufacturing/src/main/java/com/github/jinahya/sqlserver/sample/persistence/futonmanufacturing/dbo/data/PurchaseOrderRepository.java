package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.PurchaseOrder;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link PurchaseOrder}, the {@code dbo.PurchaseOrder} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see PurchaseOrder
 */
@Repository
public interface PurchaseOrderRepository
        extends _Repository<PurchaseOrder, Integer> {

}
