package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.PriceList;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link PriceList}, the {@code dbo.PriceList} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see PriceList
 */
@Repository
public interface PriceListRepository
        extends _Repository<PriceList, Integer> {

}
