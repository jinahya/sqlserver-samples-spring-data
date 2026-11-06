package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.ProductModelProductDescriptionCultureId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductModelProductDescriptionCulture;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ProductModelProductDescriptionCulture}, the {@code
 * Production.ProductModelProductDescriptionCulture} table of AdventureWorks.
 * <p>
 * The id is {@link ProductModelProductDescriptionCultureId}, upstream's {@code @Embeddable} id class, which the entity maps with
 * {@code @EmbeddedId}.
 *
 * @see ProductModelProductDescriptionCulture
 */
@Repository
public interface ProductModelProductDescriptionCultureRepository
        extends _Repository<ProductModelProductDescriptionCulture, ProductModelProductDescriptionCultureId> {

}
