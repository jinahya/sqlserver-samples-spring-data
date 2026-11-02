package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.MappedProductListPriceHistoryId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductListPriceHistory;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ProductListPriceHistory}, the {@code Production.ProductListPriceHistory} table of
 * AdventureWorks.
 * <p>
 * The id is {@link MappedProductListPriceHistoryId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see ProductListPriceHistory
 */
@Repository
public interface ProductListPriceHistoryRepository
        extends _Repository<ProductListPriceHistory, MappedProductListPriceHistoryId> {

}
