package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesStorePerformanceView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesStorePerformanceView}, the {@code dbo.vw_Sales_StorePerformance} view of
 * FutonManufacturing.
 * <p>
 * The id is {@link String}.
 *
 * @see SalesStorePerformanceView
 */
@Repository
public interface SalesStorePerformanceViewRepository
        extends _Repository<SalesStorePerformanceView, String> {

}
