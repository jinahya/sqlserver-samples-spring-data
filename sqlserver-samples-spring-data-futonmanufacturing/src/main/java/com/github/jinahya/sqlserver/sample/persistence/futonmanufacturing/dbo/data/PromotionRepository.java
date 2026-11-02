package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.Promotion;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Promotion}, the {@code dbo.Promotion} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Promotion
 */
@Repository
public interface PromotionRepository
        extends _Repository<Promotion, Integer> {

}
