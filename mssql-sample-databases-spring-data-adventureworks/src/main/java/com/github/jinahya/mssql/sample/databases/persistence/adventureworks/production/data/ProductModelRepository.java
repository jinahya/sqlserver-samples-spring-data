package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductModel;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ProductModel}, the {@code Production.ProductModel} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see ProductModel
 */
@Repository
public interface ProductModelRepository
        extends _Repository<ProductModel, Integer> {

}
