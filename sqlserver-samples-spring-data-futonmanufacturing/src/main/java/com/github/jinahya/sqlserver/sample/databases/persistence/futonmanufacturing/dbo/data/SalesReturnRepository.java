package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesReturn;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesReturn}, the {@code dbo.SalesReturn} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SalesReturn
 */
@Repository
public interface SalesReturnRepository
        extends _Repository<SalesReturn, Integer> {

}
