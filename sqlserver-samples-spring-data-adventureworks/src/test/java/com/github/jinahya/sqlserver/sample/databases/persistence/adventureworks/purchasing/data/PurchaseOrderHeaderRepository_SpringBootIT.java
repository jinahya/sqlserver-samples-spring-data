package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.purchasing.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.purchasing.PurchaseOrderHeader;

/**
 * Tests {@link PurchaseOrderHeaderRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class PurchaseOrderHeaderRepository_SpringBootIT
        extends _Repository_SpringBootIT<PurchaseOrderHeaderRepository, PurchaseOrderHeader, Integer> {

    /**
     * Creates a new instance.
     */
    PurchaseOrderHeaderRepository_SpringBootIT() {
        super(PurchaseOrderHeaderRepository.class, PurchaseOrderHeader.class, Integer.class);
    }
}
