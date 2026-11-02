package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.UnitMeasure;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.UnitMeasureRepository;

/**
 * Tests {@link UnitMeasureRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class UnitMeasureRepository_SpringBootIT
        extends _Repository_SpringBootIT<UnitMeasureRepository, UnitMeasure, String> {

    /**
     * Creates a new instance.
     */
    UnitMeasureRepository_SpringBootIT() {
        super(UnitMeasureRepository.class, UnitMeasure.class, String.class);
    }
}
