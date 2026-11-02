package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductPhoto;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ProductPhoto}, the {@code Production.ProductPhoto} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see ProductPhoto
 */
@Repository
public interface ProductPhotoRepository
        extends _Repository<ProductPhoto, Integer> {

}
