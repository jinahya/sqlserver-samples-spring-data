package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.Invoice;
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
