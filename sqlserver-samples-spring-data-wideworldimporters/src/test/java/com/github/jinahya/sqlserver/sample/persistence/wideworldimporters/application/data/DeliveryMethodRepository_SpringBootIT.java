package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.application.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.application.DeliveryMethod;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.application.data.DeliveryMethodRepository;

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
