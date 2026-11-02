package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.purchasing.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.purchasing.PurchaseOrder;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.purchasing.data.PurchaseOrderRepository;

/**
 * Tests {@link PurchaseOrderRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class PurchaseOrderRepository_SpringBootIT
        extends _Repository_SpringBootIT<PurchaseOrderRepository, PurchaseOrder, Integer> {

    /**
     * Creates a new instance.
     */
    PurchaseOrderRepository_SpringBootIT() {
        super(PurchaseOrderRepository.class, PurchaseOrder.class, Integer.class);
    }
}
