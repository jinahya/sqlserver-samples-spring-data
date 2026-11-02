package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.ProductModelCatalogDescriptionView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ProductModelCatalogDescriptionView}, the {@code Production.vProductModelCatalogDescription}
 * view of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see ProductModelCatalogDescriptionView
 */
@Repository
public interface ProductModelCatalogDescriptionViewRepository
        extends _Repository<ProductModelCatalogDescriptionView, Integer> {

}
