package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SalesReturnDetail;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesReturnDetail}, the {@code dbo.SalesReturnDetail} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SalesReturnDetail
 */
@Repository
public interface SalesReturnDetailRepository
        extends _Repository<SalesReturnDetail, Integer> {

}
