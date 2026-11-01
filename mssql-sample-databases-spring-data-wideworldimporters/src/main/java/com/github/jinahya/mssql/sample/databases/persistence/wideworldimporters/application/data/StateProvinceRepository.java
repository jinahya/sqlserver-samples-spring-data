package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.StateProvince;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link StateProvince}, the {@code Application.StateProvinces} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see StateProvince
 */
@Repository
public interface StateProvinceRepository
        extends _Repository<StateProvince, Integer> {

}
