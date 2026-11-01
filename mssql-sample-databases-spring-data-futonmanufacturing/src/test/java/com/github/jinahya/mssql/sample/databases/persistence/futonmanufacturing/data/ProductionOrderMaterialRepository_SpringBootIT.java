package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.ProductionOrderMaterial;

/**
 * Tests {@link ProductionOrderMaterialRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class ProductionOrderMaterialRepository_SpringBootIT
        extends _Repository_SpringBootIT<ProductionOrderMaterialRepository, ProductionOrderMaterial, Integer> {

    /**
     * Creates a new instance.
     */
    ProductionOrderMaterialRepository_SpringBootIT() {
        super(ProductionOrderMaterialRepository.class, ProductionOrderMaterial.class, Integer.class);
    }
}
