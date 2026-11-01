package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.Item;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Item}, the {@code dbo.Items} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Item
 */
@Repository
public interface ItemRepository
        extends _Repository<Item, Integer> {

}
