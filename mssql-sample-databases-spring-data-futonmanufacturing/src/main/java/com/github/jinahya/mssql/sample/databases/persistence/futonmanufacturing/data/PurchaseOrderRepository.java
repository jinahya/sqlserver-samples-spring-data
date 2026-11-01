package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.PurchaseOrder;
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
