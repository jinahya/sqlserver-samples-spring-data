package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.PurchaseOrderDetail;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.PurchaseOrderDetailRepository;

/**
 * Tests {@link PurchaseOrderDetailRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class PurchaseOrderDetailRepository_SpringBootIT
        extends _Repository_SpringBootIT<PurchaseOrderDetailRepository, PurchaseOrderDetail, Integer> {

    /**
     * Creates a new instance.
     */
    PurchaseOrderDetailRepository_SpringBootIT() {
        super(PurchaseOrderDetailRepository.class, PurchaseOrderDetail.class, Integer.class);
    }
}
