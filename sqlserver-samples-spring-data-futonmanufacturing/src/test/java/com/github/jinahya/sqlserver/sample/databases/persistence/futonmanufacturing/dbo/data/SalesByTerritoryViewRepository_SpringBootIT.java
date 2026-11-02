package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesByTerritoryView;

/**
 * Tests {@link SalesByTerritoryViewRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class SalesByTerritoryViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<SalesByTerritoryViewRepository, SalesByTerritoryView, String> {

    /**
     * Creates a new instance.
     */
    SalesByTerritoryViewRepository_SpringBootIT() {
        super(SalesByTerritoryViewRepository.class, SalesByTerritoryView.class, String.class);
    }
}
