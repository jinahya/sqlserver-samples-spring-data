package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesQuote;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesQuote}, the {@code dbo.SalesQuote} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SalesQuote
 */
@Repository
public interface SalesQuoteRepository
        extends _Repository<SalesQuote, Integer> {

}
