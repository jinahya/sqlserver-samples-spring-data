package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.purchasing.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.purchasing.MappedPurchaseOrderDetailId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.purchasing.PurchaseOrderDetail;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link PurchaseOrderDetail}, the {@code Purchasing.PurchaseOrderDetail} table of AdventureWorks.
 * <p>
 * The id is {@link MappedPurchaseOrderDetailId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see PurchaseOrderDetail
 */
@Repository
public interface PurchaseOrderDetailRepository
        extends _Repository<PurchaseOrderDetail, MappedPurchaseOrderDetailId> {

}
