package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesCustomerSegmentationView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesCustomerSegmentationView}, the {@code dbo.vw_Sales_CustomerSegmentation} view of
 * FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SalesCustomerSegmentationView
 */
@Repository
public interface SalesCustomerSegmentationViewRepository
        extends _Repository<SalesCustomerSegmentationView, Integer> {

}
