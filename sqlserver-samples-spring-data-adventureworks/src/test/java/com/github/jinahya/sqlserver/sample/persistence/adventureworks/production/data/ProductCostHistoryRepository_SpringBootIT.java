package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.MappedProductCostHistoryId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductCostHistory;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.ProductCostHistoryRepository;

/**
 * Tests {@link ProductCostHistoryRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ProductCostHistoryRepository_SpringBootIT
        extends _Repository_SpringBootIT<ProductCostHistoryRepository, ProductCostHistory, MappedProductCostHistoryId> {

    /**
     * Creates a new instance.
     */
    ProductCostHistoryRepository_SpringBootIT() {
        super(ProductCostHistoryRepository.class, ProductCostHistory.class, MappedProductCostHistoryId.class);
    }
}
