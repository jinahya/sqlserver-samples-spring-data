package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.UnitOfMeasure;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link UnitOfMeasure}, the {@code dbo.UnitOfMeasure} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see UnitOfMeasure
 */
@Repository
public interface UnitOfMeasureRepository
        extends _Repository<UnitOfMeasure, Integer> {

}
