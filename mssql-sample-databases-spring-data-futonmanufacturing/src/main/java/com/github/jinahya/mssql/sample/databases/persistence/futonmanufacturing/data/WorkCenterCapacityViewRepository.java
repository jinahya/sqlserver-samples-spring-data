package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.WorkCenterCapacityView;
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
