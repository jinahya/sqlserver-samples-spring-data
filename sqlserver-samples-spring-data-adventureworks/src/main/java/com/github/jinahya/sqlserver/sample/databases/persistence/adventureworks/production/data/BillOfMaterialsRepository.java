package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.BillOfMaterials;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link BillOfMaterials}, the {@code Production.BillOfMaterials} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see BillOfMaterials
 */
@Repository
public interface BillOfMaterialsRepository
        extends _Repository<BillOfMaterials, Integer> {

}
