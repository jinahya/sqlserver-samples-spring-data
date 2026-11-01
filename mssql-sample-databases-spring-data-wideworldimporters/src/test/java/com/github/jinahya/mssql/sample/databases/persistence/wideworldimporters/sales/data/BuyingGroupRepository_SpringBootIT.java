package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.BuyingGroup;

/**
 * Tests {@link BuyingGroupRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class BuyingGroupRepository_SpringBootIT
        extends _Repository_SpringBootIT<BuyingGroupRepository, BuyingGroup, Integer> {

    /**
     * Creates a new instance.
     */
    BuyingGroupRepository_SpringBootIT() {
        super(BuyingGroupRepository.class, BuyingGroup.class, Integer.class);
    }
}
