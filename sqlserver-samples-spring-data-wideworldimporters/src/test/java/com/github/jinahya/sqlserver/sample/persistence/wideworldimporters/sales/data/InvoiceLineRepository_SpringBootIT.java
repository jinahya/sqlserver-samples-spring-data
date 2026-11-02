package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.InvoiceLine;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.data.InvoiceLineRepository;

/**
 * Tests {@link InvoiceLineRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class InvoiceLineRepository_SpringBootIT
        extends _Repository_SpringBootIT<InvoiceLineRepository, InvoiceLine, Integer> {

    /**
     * Creates a new instance.
     */
    InvoiceLineRepository_SpringBootIT() {
        super(InvoiceLineRepository.class, InvoiceLine.class, Integer.class);
    }
}
