package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesRepPerformanceView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesRepPerformanceView}, the {@code dbo.vw_Sales_RepPerformance} view of FutonManufacturing.
 * <p>
 * The id is {@link String}.
 *
 * @see SalesRepPerformanceView
 */
@Repository
public interface SalesRepPerformanceViewRepository
        extends _Repository<SalesRepPerformanceView, String> {

}
