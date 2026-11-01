package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.CustomerCategory;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link CustomerCategory}, the {@code Sales.CustomerCategories} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see CustomerCategory
 */
@Repository
public interface CustomerCategoryRepository
        extends _Repository<CustomerCategory, Integer> {

}
