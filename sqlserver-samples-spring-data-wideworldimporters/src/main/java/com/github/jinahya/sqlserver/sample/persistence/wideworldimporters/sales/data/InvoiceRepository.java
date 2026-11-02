package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.Invoice;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Invoice}, the {@code Sales.Invoices} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Invoice
 */
@Repository
public interface InvoiceRepository
        extends _Repository<Invoice, Integer> {

}
