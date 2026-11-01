package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.purchasing.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.purchasing.MappedPurchaseOrderDetailId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.purchasing.PurchaseOrderDetail;

/**
 * Tests {@link PurchaseOrderDetailRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class PurchaseOrderDetailRepository_SpringBootIT
        extends _Repository_SpringBootIT<PurchaseOrderDetailRepository, PurchaseOrderDetail,
                                         MappedPurchaseOrderDetailId> {

    /**
     * Creates a new instance.
     */
    PurchaseOrderDetailRepository_SpringBootIT() {
        super(PurchaseOrderDetailRepository.class, PurchaseOrderDetail.class, MappedPurchaseOrderDetailId.class);
    }
}
