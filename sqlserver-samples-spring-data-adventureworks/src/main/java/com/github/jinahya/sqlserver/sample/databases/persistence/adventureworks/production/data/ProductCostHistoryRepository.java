package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.mapped.production.MappedProductCostHistoryId;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.ProductCostHistory;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ProductCostHistory}, the {@code Production.ProductCostHistory} table of AdventureWorks.
 * <p>
 * The id is {@link MappedProductCostHistoryId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see ProductCostHistory
 */
@Repository
public interface ProductCostHistoryRepository
        extends _Repository<ProductCostHistory, MappedProductCostHistoryId> {

}
