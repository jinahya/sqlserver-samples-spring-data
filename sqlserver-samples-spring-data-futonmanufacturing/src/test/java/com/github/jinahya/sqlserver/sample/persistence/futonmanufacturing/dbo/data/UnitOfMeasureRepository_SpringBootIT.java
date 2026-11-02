package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.UnitOfMeasure;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.UnitOfMeasureRepository;

/**
 * Tests {@link UnitOfMeasureRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class UnitOfMeasureRepository_SpringBootIT
        extends _Repository_SpringBootIT<UnitOfMeasureRepository, UnitOfMeasure, Integer> {

    /**
     * Creates a new instance.
     */
    UnitOfMeasureRepository_SpringBootIT() {
        super(UnitOfMeasureRepository.class, UnitOfMeasure.class, Integer.class);
    }
}
