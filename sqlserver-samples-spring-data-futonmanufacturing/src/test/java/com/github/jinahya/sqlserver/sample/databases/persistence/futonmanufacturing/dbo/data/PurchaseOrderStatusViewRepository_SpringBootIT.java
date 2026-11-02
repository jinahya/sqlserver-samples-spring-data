package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.PurchaseOrderStatusView;

/**
 * Tests {@link PurchaseOrderStatusViewRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class PurchaseOrderStatusViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<PurchaseOrderStatusViewRepository, PurchaseOrderStatusView, String> {

    /**
     * Creates a new instance.
     */
    PurchaseOrderStatusViewRepository_SpringBootIT() {
        super(PurchaseOrderStatusViewRepository.class, PurchaseOrderStatusView.class, String.class);
    }
}
