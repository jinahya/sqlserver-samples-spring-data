package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SalesTerritory;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.SalesTerritoryRepository;

/**
 * Tests {@link SalesTerritoryRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class SalesTerritoryRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesTerritoryRepository, SalesTerritory, Integer> {

    /**
     * Creates a new instance.
     */
    SalesTerritoryRepository_SpringBootIT() {
        super(SalesTerritoryRepository.class, SalesTerritory.class, Integer.class);
    }
}
