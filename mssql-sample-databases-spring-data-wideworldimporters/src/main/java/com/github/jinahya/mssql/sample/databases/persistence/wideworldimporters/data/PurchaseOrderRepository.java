package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.purchasing.PurchaseOrder;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link PurchaseOrder}, the {@code Purchasing.PurchaseOrders} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see PurchaseOrder
 */
@Repository
public interface PurchaseOrderRepository
        extends _Repository<PurchaseOrder, Integer> {

}
