package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.application.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.application.City;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link City}, the {@code Application.Cities} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see City
 */
@Repository
public interface CityRepository
        extends _Repository<City, Integer> {

}
