package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.WorkCenter;
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
