package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.StateProvinceCountryRegionView;
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
