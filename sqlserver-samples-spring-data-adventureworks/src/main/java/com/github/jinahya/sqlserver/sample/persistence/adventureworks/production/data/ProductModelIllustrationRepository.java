package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.MappedProductModelIllustrationId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductModelIllustration;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ProductModelIllustration}, the {@code Production.ProductModelIllustration} table of
 * AdventureWorks.
 * <p>
 * The id is {@link MappedProductModelIllustrationId}, upstream's id class, which the entity names with {@code
 * @IdClass}.
 *
 * @see ProductModelIllustration
 */
@Repository
public interface ProductModelIllustrationRepository
        extends _Repository<ProductModelIllustration, MappedProductModelIllustrationId> {

}
