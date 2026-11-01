package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.BillOfMaterials;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link BillOfMaterials}, the {@code dbo.BillOfMaterials} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see BillOfMaterials
 */
@Repository
public interface BillOfMaterialsRepository
        extends _Repository<BillOfMaterials, Integer> {

}
