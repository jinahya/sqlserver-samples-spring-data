package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.PurchaseOrderDetail;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link PurchaseOrderDetail}, the {@code dbo.PurchaseOrderDetail} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see PurchaseOrderDetail
 */
@Repository
public interface PurchaseOrderDetailRepository
        extends _Repository<PurchaseOrderDetail, Integer> {

}
