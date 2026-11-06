package com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.purchasing.PurchaseOrderDetailId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.PurchaseOrderDetail;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.data.PurchaseOrderDetailRepository;

/**
 * Tests {@link PurchaseOrderDetailRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class PurchaseOrderDetailRepository_SpringBootIT
        extends _Repository_SpringBootIT<PurchaseOrderDetailRepository, PurchaseOrderDetail,
                                         PurchaseOrderDetailId> {

    /**
     * Creates a new instance.
     */
    PurchaseOrderDetailRepository_SpringBootIT() {
        super(PurchaseOrderDetailRepository.class, PurchaseOrderDetail.class, PurchaseOrderDetailId.class);
    }
}
