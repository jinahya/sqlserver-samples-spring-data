package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.production.MappedProductInventoryId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductInventory;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ProductInventory}, the {@code Production.ProductInventory} table of AdventureWorks.
 * <p>
 * The id is {@link MappedProductInventoryId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see ProductInventory
 */
@Repository
public interface ProductInventoryRepository
        extends _Repository<ProductInventory, MappedProductInventoryId> {

}
