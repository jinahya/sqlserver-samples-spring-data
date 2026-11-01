package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SupplierPerformanceView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SupplierPerformanceView}, the {@code dbo.vw_SupplierPerformance} view of FutonManufacturing.
 * <p>
 * The id is {@link String}.
 *
 * @see SupplierPerformanceView
 */
@Repository
public interface SupplierPerformanceViewRepository
        extends _Repository<SupplierPerformanceView, String> {

}
