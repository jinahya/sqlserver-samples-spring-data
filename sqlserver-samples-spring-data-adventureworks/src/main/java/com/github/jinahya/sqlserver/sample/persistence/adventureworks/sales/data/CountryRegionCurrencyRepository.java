package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.CountryRegionCurrencyId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.CountryRegionCurrency;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link CountryRegionCurrency}, the {@code Sales.CountryRegionCurrency} table of AdventureWorks.
 * <p>
 * The id is {@link CountryRegionCurrencyId}, upstream's {@code @Embeddable} id class, which the entity maps with
 * {@code @EmbeddedId}.
 *
 * @see CountryRegionCurrency
 */
@Repository
public interface CountryRegionCurrencyRepository
        extends _Repository<CountryRegionCurrency, CountryRegionCurrencyId> {

}
