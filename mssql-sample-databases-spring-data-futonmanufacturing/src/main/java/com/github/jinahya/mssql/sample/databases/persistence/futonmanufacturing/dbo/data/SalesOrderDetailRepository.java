package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesOrderDetail;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesOrderDetail}, the {@code dbo.SalesOrderDetail} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SalesOrderDetail
 */
@Repository
public interface SalesOrderDetailRepository
        extends _Repository<SalesOrderDetail, Integer> {

}
