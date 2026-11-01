package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesByTerritoryView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesByTerritoryView}, the {@code dbo.vw_Sales_ByTerritory} view of FutonManufacturing.
 * <p>
 * The id is {@link String}.
 *
 * @see SalesByTerritoryView
 */
@Repository
public interface SalesByTerritoryViewRepository
        extends _Repository<SalesByTerritoryView, String> {

}
