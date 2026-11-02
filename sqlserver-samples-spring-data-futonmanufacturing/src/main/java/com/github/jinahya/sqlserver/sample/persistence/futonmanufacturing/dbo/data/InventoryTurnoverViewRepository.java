package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.InventoryTurnoverView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link InventoryTurnoverView}, the {@code dbo.vw_InventoryTurnover} view of FutonManufacturing.
 * <p>
 * The id is {@link String}.
 *
 * @see InventoryTurnoverView
 */
@Repository
public interface InventoryTurnoverViewRepository
        extends _Repository<InventoryTurnoverView, String> {

}
