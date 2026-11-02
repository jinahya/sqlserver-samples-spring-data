package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.CurrencyRate;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link CurrencyRate}, the {@code Sales.CurrencyRate} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see CurrencyRate
 */
@Repository
public interface CurrencyRateRepository
        extends _Repository<CurrencyRate, Integer> {

}
