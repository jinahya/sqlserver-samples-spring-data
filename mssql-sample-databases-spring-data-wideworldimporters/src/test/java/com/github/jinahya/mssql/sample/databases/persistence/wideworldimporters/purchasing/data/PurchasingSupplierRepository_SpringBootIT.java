package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.purchasing.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.purchasing.Supplier;

/**
 * Tests {@link PurchasingSupplierRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class PurchasingSupplierRepository_SpringBootIT
        extends _Repository_SpringBootIT<PurchasingSupplierRepository, Supplier, Integer> {

    /**
     * Creates a new instance.
     */
    PurchasingSupplierRepository_SpringBootIT() {
        super(PurchasingSupplierRepository.class, Supplier.class, Integer.class);
    }
}
