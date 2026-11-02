package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.QualityInspection;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link QualityInspection}, the {@code dbo.QualityInspection} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see QualityInspection
 */
@Repository
public interface QualityInspectionRepository
        extends _Repository<QualityInspection, Integer> {

}
