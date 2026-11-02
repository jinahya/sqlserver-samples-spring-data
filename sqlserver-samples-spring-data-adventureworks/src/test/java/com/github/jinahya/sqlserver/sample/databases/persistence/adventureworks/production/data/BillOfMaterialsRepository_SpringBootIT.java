package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.BillOfMaterials;

/**
 * Tests {@link BillOfMaterialsRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class BillOfMaterialsRepository_SpringBootIT
        extends _Repository_SpringBootIT<BillOfMaterialsRepository, BillOfMaterials, Integer> {

    /**
     * Creates a new instance.
     */
    BillOfMaterialsRepository_SpringBootIT() {
        super(BillOfMaterialsRepository.class, BillOfMaterials.class, Integer.class);
    }
}
