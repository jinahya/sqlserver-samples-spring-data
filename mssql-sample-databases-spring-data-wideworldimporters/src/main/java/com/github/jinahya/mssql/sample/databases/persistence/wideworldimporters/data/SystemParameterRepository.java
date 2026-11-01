package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.SystemParameter;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SystemParameter}, the {@code Application.SystemParameters} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SystemParameter
 */
@Repository
public interface SystemParameterRepository
        extends _Repository<SystemParameter, Integer> {

}
