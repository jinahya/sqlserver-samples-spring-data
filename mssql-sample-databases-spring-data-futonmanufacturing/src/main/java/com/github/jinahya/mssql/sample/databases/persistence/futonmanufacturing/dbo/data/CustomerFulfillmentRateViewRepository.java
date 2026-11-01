package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.CustomerFulfillmentRateView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link CustomerFulfillmentRateView}, the {@code dbo.vw_CustomerFulfillmentRate} view of
 * FutonManufacturing.
 * <p>
 * The id is {@link String}.
 *
 * @see CustomerFulfillmentRateView
 */
@Repository
public interface CustomerFulfillmentRateViewRepository
        extends _Repository<CustomerFulfillmentRateView, String> {

}
