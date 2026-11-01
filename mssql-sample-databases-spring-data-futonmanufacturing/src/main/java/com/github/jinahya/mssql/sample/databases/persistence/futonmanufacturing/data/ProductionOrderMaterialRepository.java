package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.ProductionOrderMaterial;
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
