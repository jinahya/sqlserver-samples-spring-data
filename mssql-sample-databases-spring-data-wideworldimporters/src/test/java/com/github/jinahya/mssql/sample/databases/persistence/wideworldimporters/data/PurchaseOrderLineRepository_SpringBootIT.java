package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.purchasing.PurchaseOrderLine;

/**
 * Tests {@link PurchaseOrderLineRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class PurchaseOrderLineRepository_SpringBootIT
        extends _Repository_SpringBootIT<PurchaseOrderLineRepository, PurchaseOrderLine, Integer> {

    /**
     * Creates a new instance.
     */
    PurchaseOrderLineRepository_SpringBootIT() {
        super(PurchaseOrderLineRepository.class, PurchaseOrderLine.class, Integer.class);
    }
}
