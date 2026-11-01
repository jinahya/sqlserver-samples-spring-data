package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.Country;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Country}, the {@code Application.Countries} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Country
 */
@Repository
public interface CountryRepository
        extends _Repository<Country, Integer> {

}
