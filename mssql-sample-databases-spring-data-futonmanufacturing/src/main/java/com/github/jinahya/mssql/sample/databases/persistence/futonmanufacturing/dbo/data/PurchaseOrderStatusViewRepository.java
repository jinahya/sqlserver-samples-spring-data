package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.PurchaseOrderStatusView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link PurchaseOrderStatusView}, the {@code dbo.vw_PurchaseOrderStatus} view of FutonManufacturing.
 * <p>
 * The id is {@link String}.
 *
 * @see PurchaseOrderStatusView
 */
@Repository
public interface PurchaseOrderStatusViewRepository
        extends _Repository<PurchaseOrderStatusView, String> {

}
