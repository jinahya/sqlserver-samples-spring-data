package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.Invoice;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.data.InvoiceRepository;

/**
 * Tests {@link InvoiceRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class InvoiceRepository_SpringBootIT
        extends _Repository_SpringBootIT<InvoiceRepository, Invoice, Integer> {

    /**
     * Creates a new instance.
     */
    InvoiceRepository_SpringBootIT() {
        super(InvoiceRepository.class, Invoice.class, Integer.class);
    }
}
