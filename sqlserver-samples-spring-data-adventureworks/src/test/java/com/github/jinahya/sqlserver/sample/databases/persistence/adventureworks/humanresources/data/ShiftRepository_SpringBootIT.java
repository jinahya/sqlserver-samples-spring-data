package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.humanresources.Shift;

/**
 * Tests {@link ShiftRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ShiftRepository_SpringBootIT
        extends _Repository_SpringBootIT<ShiftRepository, Shift, Long> {

    /**
     * Creates a new instance.
     */
    ShiftRepository_SpringBootIT() {
        super(ShiftRepository.class, Shift.class, Long.class);
    }
}
