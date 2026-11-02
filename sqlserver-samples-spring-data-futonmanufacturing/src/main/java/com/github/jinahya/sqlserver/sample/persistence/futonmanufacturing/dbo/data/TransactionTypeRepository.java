package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.TransactionType;
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
