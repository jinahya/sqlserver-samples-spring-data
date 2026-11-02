package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SalesQuoteDetail;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesQuoteDetail}, the {@code dbo.SalesQuoteDetail} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SalesQuoteDetail
 */
@Repository
public interface SalesQuoteDetailRepository
        extends _Repository<SalesQuoteDetail, Integer> {

}
