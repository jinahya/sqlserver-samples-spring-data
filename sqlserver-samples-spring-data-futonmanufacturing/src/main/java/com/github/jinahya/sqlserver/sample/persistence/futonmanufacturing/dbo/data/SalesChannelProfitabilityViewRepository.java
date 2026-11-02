package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SalesChannelProfitabilityView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesChannelProfitabilityView}, the {@code dbo.vw_Sales_ChannelProfitability} view of
 * FutonManufacturing.
 * <p>
 * The id is {@link String}.
 *
 * @see SalesChannelProfitabilityView
 */
@Repository
public interface SalesChannelProfitabilityViewRepository
        extends _Repository<SalesChannelProfitabilityView, String> {

}
