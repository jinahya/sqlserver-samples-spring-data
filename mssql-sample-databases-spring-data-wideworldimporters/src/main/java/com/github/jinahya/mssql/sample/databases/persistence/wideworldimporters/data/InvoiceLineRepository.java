package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.InvoiceLine;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link InvoiceLine}, the {@code Sales.InvoiceLines} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see InvoiceLine
 */
@Repository
public interface InvoiceLineRepository
        extends _Repository<InvoiceLine, Integer> {

}
