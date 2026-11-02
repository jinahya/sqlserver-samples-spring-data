package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.WorkCenterCapacityView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link WorkCenterCapacityView}, the {@code dbo.vw_WorkCenterCapacity} view of FutonManufacturing.
 * <p>
 * The id is {@link String}.
 *
 * @see WorkCenterCapacityView
 */
@Repository
public interface WorkCenterCapacityViewRepository
        extends _Repository<WorkCenterCapacityView, String> {

}
