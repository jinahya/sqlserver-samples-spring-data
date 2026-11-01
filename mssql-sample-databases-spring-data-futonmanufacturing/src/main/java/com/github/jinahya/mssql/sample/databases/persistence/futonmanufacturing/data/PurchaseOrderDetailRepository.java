package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.PurchaseOrderDetail;
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
