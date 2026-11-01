package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.PriceListDetail;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link PriceListDetail}, the {@code dbo.PriceListDetail} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see PriceListDetail
 */
@Repository
public interface PriceListDetailRepository
        extends _Repository<PriceListDetail, Integer> {

}
