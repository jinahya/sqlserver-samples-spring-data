package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.Store;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Store}, the {@code dbo.Store} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Store
 */
@Repository
public interface StoreRepository
        extends _Repository<Store, Integer> {

}
