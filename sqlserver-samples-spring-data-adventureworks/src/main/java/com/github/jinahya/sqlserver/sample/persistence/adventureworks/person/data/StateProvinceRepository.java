package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.StateProvince;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link StateProvince}, the {@code Person.StateProvince} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see StateProvince
 */
@Repository
public interface StateProvinceRepository
        extends _Repository<StateProvince, Integer> {

}
