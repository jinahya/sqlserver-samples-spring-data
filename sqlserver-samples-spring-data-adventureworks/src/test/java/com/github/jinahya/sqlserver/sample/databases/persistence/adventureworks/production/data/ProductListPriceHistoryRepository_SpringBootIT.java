package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.mapped.production.MappedProductListPriceHistoryId;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.ProductListPriceHistory;

/**
 * Tests {@link ProductListPriceHistoryRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ProductListPriceHistoryRepository_SpringBootIT
        extends _Repository_SpringBootIT<ProductListPriceHistoryRepository, ProductListPriceHistory,
                                         MappedProductListPriceHistoryId> {

    /**
     * Creates a new instance.
     */
    ProductListPriceHistoryRepository_SpringBootIT() {
        super(ProductListPriceHistoryRepository.class, ProductListPriceHistory.class,
              MappedProductListPriceHistoryId.class);
    }
}
