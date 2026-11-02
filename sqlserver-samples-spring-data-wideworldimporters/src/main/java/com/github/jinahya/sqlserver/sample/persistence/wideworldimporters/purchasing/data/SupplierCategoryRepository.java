package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.purchasing.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.purchasing.SupplierCategory;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SupplierCategory}, the {@code Purchasing.SupplierCategories} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SupplierCategory
 */
@Repository
public interface SupplierCategoryRepository
        extends _Repository<SupplierCategory, Integer> {

}
