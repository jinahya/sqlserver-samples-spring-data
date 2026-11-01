package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.TransactionType;
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
