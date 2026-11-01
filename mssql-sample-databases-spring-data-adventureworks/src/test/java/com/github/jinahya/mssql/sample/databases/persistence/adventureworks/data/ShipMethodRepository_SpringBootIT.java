package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.purchasing.ShipMethod;

/**
 * Tests {@link ShipMethodRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ShipMethodRepository_SpringBootIT
        extends _Repository_SpringBootIT<ShipMethodRepository, ShipMethod, Integer> {

    /**
     * Creates a new instance.
     */
    ShipMethodRepository_SpringBootIT() {
        super(ShipMethodRepository.class, ShipMethod.class, Integer.class);
    }
}
