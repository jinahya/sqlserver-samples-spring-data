package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SalesChannel;
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
