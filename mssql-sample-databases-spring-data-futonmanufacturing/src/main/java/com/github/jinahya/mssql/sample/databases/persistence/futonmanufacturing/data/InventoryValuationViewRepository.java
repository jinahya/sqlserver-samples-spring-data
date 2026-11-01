package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.InventoryValuationView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link InventoryValuationView}, the {@code dbo.vw_InventoryValuation} view of FutonManufacturing.
 * <p>
 * The id is {@link String}.
 *
 * @see InventoryValuationView
 */
@Repository
public interface InventoryValuationViewRepository
        extends _Repository<InventoryValuationView, String> {

}
