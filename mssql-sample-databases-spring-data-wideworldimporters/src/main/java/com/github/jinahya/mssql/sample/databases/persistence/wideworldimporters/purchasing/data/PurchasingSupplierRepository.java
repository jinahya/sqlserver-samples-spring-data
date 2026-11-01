package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.purchasing.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.purchasing.Supplier;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Supplier}, the {@code Purchasing.Suppliers} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Supplier
 */
@Repository
public interface PurchasingSupplierRepository
        extends _Repository<Supplier, Integer> {

}
