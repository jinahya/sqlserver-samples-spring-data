package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.Currency;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Currency}, the {@code Sales.Currency} table of AdventureWorks.
 * <p>
 * The id is {@link String}.
 *
 * @see Currency
 */
@Repository
public interface CurrencyRepository
        extends _Repository<Currency, String> {

}
