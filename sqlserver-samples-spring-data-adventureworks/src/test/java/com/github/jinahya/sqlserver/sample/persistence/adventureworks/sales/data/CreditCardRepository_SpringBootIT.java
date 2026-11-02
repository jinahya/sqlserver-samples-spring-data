package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.CreditCard;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data.CreditCardRepository;

/**
 * Tests {@link CreditCardRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class CreditCardRepository_SpringBootIT
        extends _Repository_SpringBootIT<CreditCardRepository, CreditCard, Integer> {

    /**
     * Creates a new instance.
     */
    CreditCardRepository_SpringBootIT() {
        super(CreditCardRepository.class, CreditCard.class, Integer.class);
    }
}
