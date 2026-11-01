package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.purchasing.PurchaseOrderHeader;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link PurchaseOrderHeader}, the {@code Purchasing.PurchaseOrderHeader} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see PurchaseOrderHeader
 */
@Repository
public interface PurchaseOrderHeaderRepository
        extends _Repository<PurchaseOrderHeader, Integer> {

}
