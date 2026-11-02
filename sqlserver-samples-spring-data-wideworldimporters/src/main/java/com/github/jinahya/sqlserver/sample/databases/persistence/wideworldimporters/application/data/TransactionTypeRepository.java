package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.application.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.application.TransactionType;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link TransactionType}, the {@code Application.TransactionTypes} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see TransactionType
 */
@Repository
public interface TransactionTypeRepository
        extends _Repository<TransactionType, Integer> {

}
