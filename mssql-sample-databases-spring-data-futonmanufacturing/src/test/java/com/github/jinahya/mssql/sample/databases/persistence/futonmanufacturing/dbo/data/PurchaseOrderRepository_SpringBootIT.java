package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.PurchaseOrder;

/**
 * Tests {@link PurchaseOrderRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
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
