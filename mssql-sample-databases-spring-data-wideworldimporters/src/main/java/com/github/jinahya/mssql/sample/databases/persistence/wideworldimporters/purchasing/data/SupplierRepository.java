package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.purchasing.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.purchasing.Supplier;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Supplier}, the {@code Purchasing.Suppliers} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 * <p>
 * The bean is named {@code purchasingSupplierRepository}, not after the interface: another schema of this module has a
 * {@code SupplierRepository} too, and Spring Data names a repository bean after its simple name.
 *
 * @see Supplier
 */
@Repository("purchasingSupplierRepository")
public interface SupplierRepository
        extends _Repository<Supplier, Integer> {

}
