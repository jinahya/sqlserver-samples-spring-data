package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.ReturnReason;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ReturnReason}, the {@code dbo.ReturnReason} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see ReturnReason
 */
@Repository
public interface ReturnReasonRepository
        extends _Repository<ReturnReason, Integer> {

}
