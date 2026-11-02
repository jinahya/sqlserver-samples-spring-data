package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.Location;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Location}, the {@code Production.Location} table of AdventureWorks.
 * <p>
 * The id is {@link Short}.
 *
 * @see Location
 */
@Repository
public interface LocationRepository
        extends _Repository<Location, Short> {

}
