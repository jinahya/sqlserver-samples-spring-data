package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.production.MappedProductListPriceHistoryId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductListPriceHistory;
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
