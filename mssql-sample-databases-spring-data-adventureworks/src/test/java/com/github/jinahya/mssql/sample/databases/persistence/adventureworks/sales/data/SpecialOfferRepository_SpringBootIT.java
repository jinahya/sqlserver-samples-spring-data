package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SpecialOffer;

/**
 * Tests {@link SpecialOfferRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class SpecialOfferRepository_SpringBootIT
        extends _Repository_SpringBootIT<SpecialOfferRepository, SpecialOffer, Integer> {

    /**
     * Creates a new instance.
     */
    SpecialOfferRepository_SpringBootIT() {
        super(SpecialOfferRepository.class, SpecialOffer.class, Integer.class);
    }
}
