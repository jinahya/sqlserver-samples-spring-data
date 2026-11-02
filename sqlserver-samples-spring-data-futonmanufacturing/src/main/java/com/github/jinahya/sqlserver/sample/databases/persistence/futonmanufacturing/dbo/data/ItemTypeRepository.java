package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.ItemType;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ItemType}, the {@code dbo.ItemType} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see ItemType
 */
@Repository
public interface ItemTypeRepository
        extends _Repository<ItemType, Integer> {

}
