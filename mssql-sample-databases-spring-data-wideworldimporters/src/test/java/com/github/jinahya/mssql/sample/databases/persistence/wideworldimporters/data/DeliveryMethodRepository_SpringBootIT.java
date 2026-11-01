package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.DeliveryMethod;

/**
 * Tests {@link DeliveryMethodRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class DeliveryMethodRepository_SpringBootIT
        extends _Repository_SpringBootIT<DeliveryMethodRepository, DeliveryMethod, Integer> {

    /**
     * Creates a new instance.
     */
    DeliveryMethodRepository_SpringBootIT() {
        super(DeliveryMethodRepository.class, DeliveryMethod.class, Integer.class);
    }
}
