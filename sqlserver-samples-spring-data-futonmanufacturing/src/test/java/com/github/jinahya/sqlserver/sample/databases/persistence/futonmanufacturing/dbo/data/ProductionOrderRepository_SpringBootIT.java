package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.ProductionOrder;

/**
 * Tests {@link ProductionOrderRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class ProductionOrderRepository_SpringBootIT
        extends _Repository_SpringBootIT<ProductionOrderRepository, ProductionOrder, Integer> {

    /**
     * Creates a new instance.
     */
    ProductionOrderRepository_SpringBootIT() {
        super(ProductionOrderRepository.class, ProductionOrder.class, Integer.class);
    }
}
