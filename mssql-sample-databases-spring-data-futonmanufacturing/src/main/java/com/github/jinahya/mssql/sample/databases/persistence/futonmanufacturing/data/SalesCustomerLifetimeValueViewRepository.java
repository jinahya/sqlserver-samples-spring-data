package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesCustomerLifetimeValueView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesCustomerLifetimeValueView}, the {@code dbo.vw_Sales_CustomerLifetimeValue} view of
 * FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SalesCustomerLifetimeValueView
 */
@Repository
public interface SalesCustomerLifetimeValueViewRepository
        extends _Repository<SalesCustomerLifetimeValueView, Integer> {

}
