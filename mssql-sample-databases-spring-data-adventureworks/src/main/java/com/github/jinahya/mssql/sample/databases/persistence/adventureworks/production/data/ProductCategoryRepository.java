package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductCategory;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ProductCategory}, the {@code Production.ProductCategory} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see ProductCategory
 */
@Repository
public interface ProductCategoryRepository
        extends _Repository<ProductCategory, Integer> {

}
