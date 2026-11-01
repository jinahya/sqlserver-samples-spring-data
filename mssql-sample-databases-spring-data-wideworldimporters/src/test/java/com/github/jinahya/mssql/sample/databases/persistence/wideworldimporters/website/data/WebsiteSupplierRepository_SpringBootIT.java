package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.website.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.website.Supplier;

/**
 * Tests {@link WebsiteSupplierRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class WebsiteSupplierRepository_SpringBootIT
        extends _Repository_SpringBootIT<WebsiteSupplierRepository, Supplier, Integer> {

    /**
     * Creates a new instance.
     */
    WebsiteSupplierRepository_SpringBootIT() {
        super(WebsiteSupplierRepository.class, Supplier.class, Integer.class);
    }
}
