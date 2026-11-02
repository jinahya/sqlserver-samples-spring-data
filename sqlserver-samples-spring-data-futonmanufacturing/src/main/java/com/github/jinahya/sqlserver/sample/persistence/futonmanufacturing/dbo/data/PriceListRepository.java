package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.PriceList;
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
