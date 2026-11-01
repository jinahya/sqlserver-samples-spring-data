package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesChannel;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesChannel}, the {@code dbo.SalesChannel} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SalesChannel
 */
@Repository
public interface SalesChannelRepository
        extends _Repository<SalesChannel, Integer> {

}
