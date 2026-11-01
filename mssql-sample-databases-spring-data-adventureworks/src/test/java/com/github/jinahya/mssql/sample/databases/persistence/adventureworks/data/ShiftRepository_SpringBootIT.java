package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.Shift;

/**
 * Tests {@link ShiftRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ShiftRepository_SpringBootIT
        extends _Repository_SpringBootIT<ShiftRepository, Shift, Short> {

    /**
     * Creates a new instance.
     */
    ShiftRepository_SpringBootIT() {
        super(ShiftRepository.class, Shift.class, Short.class);
    }
}
