package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesProductPerformanceView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesProductPerformanceView}, the {@code dbo.vw_Sales_ProductPerformance} view of
 * FutonManufacturing.
 * <p>
 * The id is {@link String}.
 *
 * @see SalesProductPerformanceView
 */
@Repository
public interface SalesProductPerformanceViewRepository
        extends _Repository<SalesProductPerformanceView, String> {

}
