package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.StateProvinceCountryRegionView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link StateProvinceCountryRegionView}, the {@code Person.vStateProvinceCountryRegion} view of
 * AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see StateProvinceCountryRegionView
 */
@Repository
public interface StateProvinceCountryRegionViewRepository
        extends _Repository<StateProvinceCountryRegionView, Integer> {

}
