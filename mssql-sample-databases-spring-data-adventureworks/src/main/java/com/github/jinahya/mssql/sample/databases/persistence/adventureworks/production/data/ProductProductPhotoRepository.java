package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.production.MappedProductProductPhotoId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductProductPhoto;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ProductProductPhoto}, the {@code Production.ProductProductPhoto} table of AdventureWorks.
 * <p>
 * The id is {@link MappedProductProductPhotoId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see ProductProductPhoto
 */
@Repository
public interface ProductProductPhotoRepository
        extends _Repository<ProductProductPhoto, MappedProductProductPhotoId> {

}
