package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.InventoryTransaction;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link InventoryTransaction}, the {@code dbo.InventoryTransaction} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see InventoryTransaction
 */
@Repository
public interface InventoryTransactionRepository
        extends _Repository<InventoryTransaction, Integer> {

}
