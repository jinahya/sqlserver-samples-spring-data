package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.website.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.website.Supplier;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Supplier}, the {@code Website.Suppliers} view of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Supplier
 */
@Repository
public interface WebsiteSupplierRepository
        extends _Repository<Supplier, Integer> {

}
