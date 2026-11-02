package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.sales.SpecialDeal;

/**
 * Tests {@link SpecialDealRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class SpecialDealRepository_SpringBootIT
        extends _Repository_SpringBootIT<SpecialDealRepository, SpecialDeal, Integer> {

    /**
     * Creates a new instance.
     */
    SpecialDealRepository_SpringBootIT() {
        super(SpecialDealRepository.class, SpecialDeal.class, Integer.class);
    }
}
