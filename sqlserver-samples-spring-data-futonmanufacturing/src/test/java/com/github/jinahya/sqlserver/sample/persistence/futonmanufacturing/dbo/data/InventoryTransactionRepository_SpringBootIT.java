package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.InventoryTransaction;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.InventoryTransactionRepository;

/**
 * Tests {@link InventoryTransactionRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class InventoryTransactionRepository_SpringBootIT
        extends _Repository_SpringBootIT<InventoryTransactionRepository, InventoryTransaction, Integer> {

    /**
     * Creates a new instance.
     */
    InventoryTransactionRepository_SpringBootIT() {
        super(InventoryTransactionRepository.class, InventoryTransaction.class, Integer.class);
    }
}
