package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.purchasing.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.purchasing.SupplierTransaction;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SupplierTransaction}, the {@code Purchasing.SupplierTransactions} table of
 * WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SupplierTransaction
 */
@Repository
public interface SupplierTransactionRepository
        extends _Repository<SupplierTransaction, Integer> {

}
