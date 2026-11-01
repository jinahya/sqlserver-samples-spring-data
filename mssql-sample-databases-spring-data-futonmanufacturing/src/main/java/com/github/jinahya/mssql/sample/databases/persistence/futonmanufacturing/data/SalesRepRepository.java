package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesRep;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesRep}, the {@code dbo.SalesRep} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SalesRep
 */
@Repository
public interface SalesRepRepository
        extends _Repository<SalesRep, Integer> {

}
