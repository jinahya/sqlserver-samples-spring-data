package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.BillOfMaterials;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.BillOfMaterialsRepository;

/**
 * Tests {@link BillOfMaterialsRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
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
