package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.CountryRegion;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link CountryRegion}, the {@code Person.CountryRegion} table of AdventureWorks.
 * <p>
 * The id is {@link String}.
 *
 * @see CountryRegion
 */
@Repository
public interface CountryRegionRepository
        extends _Repository<CountryRegion, String> {

}
