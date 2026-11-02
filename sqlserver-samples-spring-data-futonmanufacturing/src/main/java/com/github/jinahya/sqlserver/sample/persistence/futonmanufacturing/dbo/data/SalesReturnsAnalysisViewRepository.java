package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SalesReturnsAnalysisView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesReturnsAnalysisView}, the {@code dbo.vw_Sales_ReturnsAnalysis} view of
 * FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SalesReturnsAnalysisView
 */
@Repository
public interface SalesReturnsAnalysisViewRepository
        extends _Repository<SalesReturnsAnalysisView, Integer> {

}
