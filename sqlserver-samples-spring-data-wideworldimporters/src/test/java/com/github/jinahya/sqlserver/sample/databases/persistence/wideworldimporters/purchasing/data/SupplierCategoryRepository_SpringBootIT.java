package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.purchasing.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.purchasing.SupplierCategory;

/**
 * Tests {@link SupplierCategoryRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class SupplierCategoryRepository_SpringBootIT
        extends _Repository_SpringBootIT<SupplierCategoryRepository, SupplierCategory, Integer> {

    /**
     * Creates a new instance.
     */
    SupplierCategoryRepository_SpringBootIT() {
        super(SupplierCategoryRepository.class, SupplierCategory.class, Integer.class);
    }
}
