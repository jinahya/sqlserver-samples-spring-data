package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.TransactionType;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link TransactionType}, the {@code dbo.TransactionType} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see TransactionType
 */
@Repository
public interface TransactionTypeRepository
        extends _Repository<TransactionType, Integer> {

}
