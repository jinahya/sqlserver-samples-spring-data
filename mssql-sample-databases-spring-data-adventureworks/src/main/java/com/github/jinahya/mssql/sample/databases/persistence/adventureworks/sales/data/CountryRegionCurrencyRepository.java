package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.sales.MappedCountryRegionCurrencyId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.CountryRegionCurrency;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link CountryRegionCurrency}, the {@code Sales.CountryRegionCurrency} table of AdventureWorks.
 * <p>
 * The id is {@link MappedCountryRegionCurrencyId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see CountryRegionCurrency
 */
@Repository
public interface CountryRegionCurrencyRepository
        extends _Repository<CountryRegionCurrency, MappedCountryRegionCurrencyId> {

}
