package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesOrderBacklogView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesOrderBacklogView}, the {@code dbo.vw_SalesOrderBacklog} view of FutonManufacturing.
 * <p>
 * The id is {@link String}.
 *
 * @see SalesOrderBacklogView
 */
@Repository
public interface SalesOrderBacklogViewRepository
        extends _Repository<SalesOrderBacklogView, String> {

}
