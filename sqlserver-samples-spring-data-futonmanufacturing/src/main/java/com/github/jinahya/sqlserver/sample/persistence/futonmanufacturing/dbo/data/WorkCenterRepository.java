package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.WorkCenter;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link WorkCenter}, the {@code dbo.WorkCenter} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see WorkCenter
 */
@Repository
public interface WorkCenterRepository
        extends _Repository<WorkCenter, Integer> {

}
