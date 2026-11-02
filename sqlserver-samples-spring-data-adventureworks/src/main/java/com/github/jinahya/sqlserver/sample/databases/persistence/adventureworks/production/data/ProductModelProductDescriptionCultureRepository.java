package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.mapped.production.MappedProductModelProductDescriptionCultureId;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.ProductModelProductDescriptionCulture;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ProductModelProductDescriptionCulture}, the {@code
 * Production.ProductModelProductDescriptionCulture} table of AdventureWorks.
 * <p>
 * The id is {@link MappedProductModelProductDescriptionCultureId}, upstream's id class, which the entity names with
 * {@code @IdClass}.
 *
 * @see ProductModelProductDescriptionCulture
 */
@Repository
public interface ProductModelProductDescriptionCultureRepository
        extends _Repository<ProductModelProductDescriptionCulture, MappedProductModelProductDescriptionCultureId> {

}
