package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.ProductProductPhotoId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductProductPhoto;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ProductProductPhoto}, the {@code Production.ProductProductPhoto} table of AdventureWorks.
 * <p>
 * The id is {@link ProductProductPhotoId}, upstream's {@code @Embeddable} id class, which the entity maps with
 * {@code @EmbeddedId}.
 *
 * @see ProductProductPhoto
 */
@Repository
public interface ProductProductPhotoRepository
        extends _Repository<ProductProductPhoto, ProductProductPhotoId> {

}
