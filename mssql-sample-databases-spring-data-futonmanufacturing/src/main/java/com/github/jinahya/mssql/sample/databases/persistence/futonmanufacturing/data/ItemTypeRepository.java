package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.ItemType;
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
