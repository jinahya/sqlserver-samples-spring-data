package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.purchasing.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.purchasing.Supplier;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.purchasing.data.SupplierRepository;

/**
 * Tests {@link SupplierRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class SupplierRepository_SpringBootIT
        extends _Repository_SpringBootIT<SupplierRepository, Supplier, Integer> {

    /**
     * Creates a new instance.
     */
    SupplierRepository_SpringBootIT() {
        super(SupplierRepository.class, Supplier.class, Integer.class);
    }
}
