package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.purchasing.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.purchasing.PurchaseOrderLine;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link PurchaseOrderLine}, the {@code Purchasing.PurchaseOrderLines} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see PurchaseOrderLine
 */
@Repository
public interface PurchaseOrderLineRepository
        extends _Repository<PurchaseOrderLine, Integer> {

}
