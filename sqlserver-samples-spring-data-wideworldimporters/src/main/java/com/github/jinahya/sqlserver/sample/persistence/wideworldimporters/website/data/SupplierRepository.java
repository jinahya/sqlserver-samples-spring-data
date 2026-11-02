package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.website.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.website.Supplier;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Supplier}, the {@code Website.Suppliers} view of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 * <p>
 * The bean is named {@code websiteSupplierRepository}, not after the interface: another schema of this module has a
 * {@code SupplierRepository} too, and Spring Data names a repository bean after its simple name.
 *
 * @see Supplier
 */
@Repository("websiteSupplierRepository")
public interface SupplierRepository
        extends _Repository<Supplier, Integer> {

}
