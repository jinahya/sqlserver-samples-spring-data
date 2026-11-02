package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SupplierItem;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SupplierItem}, the {@code dbo.SupplierItem} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SupplierItem
 */
@Repository
public interface SupplierItemRepository
        extends _Repository<SupplierItem, Integer> {

}
