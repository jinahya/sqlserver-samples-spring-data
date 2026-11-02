package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.application.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.application.PaymentMethod;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository_SpringBootIT;

/**
 * Tests {@link PaymentMethodRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class PaymentMethodRepository_SpringBootIT
        extends _Repository_SpringBootIT<PaymentMethodRepository, PaymentMethod, Integer> {

    /**
     * Creates a new instance.
     */
    PaymentMethodRepository_SpringBootIT() {
        super(PaymentMethodRepository.class, PaymentMethod.class, Integer.class);
    }
}
