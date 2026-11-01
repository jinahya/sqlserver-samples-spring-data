package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.production.MappedProductAndDescriptionViewId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductAndDescriptionView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ProductAndDescriptionView}, the {@code Production.vProductAndDescription} view of
 * AdventureWorks.
 * <p>
 * The id is {@link MappedProductAndDescriptionViewId}, upstream's id class, which the entity names with {@code
 * @IdClass}.
 *
 * @see ProductAndDescriptionView
 */
@Repository
public interface ProductAndDescriptionViewRepository
        extends _Repository<ProductAndDescriptionView, MappedProductAndDescriptionViewId> {

}
