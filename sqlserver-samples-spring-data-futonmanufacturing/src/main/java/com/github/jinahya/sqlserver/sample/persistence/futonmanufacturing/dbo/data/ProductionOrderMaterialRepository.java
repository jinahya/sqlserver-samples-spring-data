package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.ProductionOrderMaterial;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ProductionOrderMaterial}, the {@code dbo.ProductionOrderMaterial} table of
 * FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see ProductionOrderMaterial
 */
@Repository
public interface ProductionOrderMaterialRepository
        extends _Repository<ProductionOrderMaterial, Integer> {

}
