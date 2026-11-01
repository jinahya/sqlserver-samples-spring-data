package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductSubcategory;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ProductSubcategory}, the {@code Production.ProductSubcategory} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see ProductSubcategory
 */
@Repository
public interface ProductSubcategoryRepository
        extends _Repository<ProductSubcategory, Integer> {

}
