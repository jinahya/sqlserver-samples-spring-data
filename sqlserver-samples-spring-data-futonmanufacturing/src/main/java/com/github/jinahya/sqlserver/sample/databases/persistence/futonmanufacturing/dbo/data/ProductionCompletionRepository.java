package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.ProductionCompletion;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ProductionCompletion}, the {@code dbo.ProductionCompletion} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see ProductionCompletion
 */
@Repository
public interface ProductionCompletionRepository
        extends _Repository<ProductionCompletion, Integer> {

}
