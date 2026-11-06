package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.ProductModelIllustrationId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductModelIllustration;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ProductModelIllustration}, the {@code Production.ProductModelIllustration} table of
 * AdventureWorks.
 * <p>
 * The id is {@link ProductModelIllustrationId}, upstream's {@code @Embeddable} id class, which the entity maps with
 * {@code @EmbeddedId}.
 *
 * @see ProductModelIllustration
 */
@Repository
public interface ProductModelIllustrationRepository
        extends _Repository<ProductModelIllustration, ProductModelIllustrationId> {

}
