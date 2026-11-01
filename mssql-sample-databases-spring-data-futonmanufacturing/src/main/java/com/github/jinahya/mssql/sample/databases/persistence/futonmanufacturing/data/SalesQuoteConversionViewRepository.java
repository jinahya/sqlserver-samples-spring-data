package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesQuoteConversionView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesQuoteConversionView}, the {@code dbo.vw_Sales_QuoteConversion} view of
 * FutonManufacturing.
 * <p>
 * The id is {@link String}.
 *
 * @see SalesQuoteConversionView
 */
@Repository
public interface SalesQuoteConversionViewRepository
        extends _Repository<SalesQuoteConversionView, String> {

}
