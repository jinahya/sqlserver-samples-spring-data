package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.sales.CustomerCategory;

/**
 * Tests {@link CustomerCategoryRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class CustomerCategoryRepository_SpringBootIT
        extends _Repository_SpringBootIT<CustomerCategoryRepository, CustomerCategory, Integer> {

    /**
     * Creates a new instance.
     */
    CustomerCategoryRepository_SpringBootIT() {
        super(CustomerCategoryRepository.class, CustomerCategory.class, Integer.class);
    }
}
