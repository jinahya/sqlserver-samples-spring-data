package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SalesCustomerLifetimeValueView;
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
