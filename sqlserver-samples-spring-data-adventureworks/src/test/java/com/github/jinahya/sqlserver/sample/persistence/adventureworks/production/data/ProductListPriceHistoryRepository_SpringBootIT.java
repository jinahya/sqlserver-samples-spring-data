package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.ProductListPriceHistoryId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductListPriceHistory;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.ProductListPriceHistoryRepository;

/**
 * Tests {@link ProductListPriceHistoryRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ProductListPriceHistoryRepository_SpringBootIT
        extends _Repository_SpringBootIT<ProductListPriceHistoryRepository, ProductListPriceHistory,
                                         ProductListPriceHistoryId> {

    /**
     * Creates a new instance.
     */
    ProductListPriceHistoryRepository_SpringBootIT() {
        super(ProductListPriceHistoryRepository.class, ProductListPriceHistory.class,
              ProductListPriceHistoryId.class);
    }
}
