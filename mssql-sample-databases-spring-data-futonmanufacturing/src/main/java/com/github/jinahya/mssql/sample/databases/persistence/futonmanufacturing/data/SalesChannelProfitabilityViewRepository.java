package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesChannelProfitabilityView;
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
