package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesCustomerAnalysisView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesCustomerAnalysisView}, the {@code dbo.vw_Sales_CustomerAnalysis} view of
 * FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SalesCustomerAnalysisView
 */
@Repository
public interface SalesCustomerAnalysisViewRepository
        extends _Repository<SalesCustomerAnalysisView, Integer> {

}
