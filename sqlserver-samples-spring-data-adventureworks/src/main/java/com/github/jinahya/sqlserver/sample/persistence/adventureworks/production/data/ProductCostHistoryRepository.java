package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.ProductCostHistoryId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductCostHistory;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ProductCostHistory}, the {@code Production.ProductCostHistory} table of AdventureWorks.
 * <p>
 * The id is {@link ProductCostHistoryId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see ProductCostHistory
 */
@Repository
public interface ProductCostHistoryRepository
        extends _Repository<ProductCostHistory, ProductCostHistoryId> {

}
