package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesQuoteDetail;
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
