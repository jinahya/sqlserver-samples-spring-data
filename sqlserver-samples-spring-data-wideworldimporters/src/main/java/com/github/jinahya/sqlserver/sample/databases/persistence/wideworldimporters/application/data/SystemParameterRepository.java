package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.application.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.application.SystemParameter;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository;
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
