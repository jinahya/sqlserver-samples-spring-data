package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.mapped.sales.MappedPersonCreditCardId;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.PersonCreditCard;

/**
 * Tests {@link PersonCreditCardRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class PersonCreditCardRepository_SpringBootIT
        extends _Repository_SpringBootIT<PersonCreditCardRepository, PersonCreditCard, MappedPersonCreditCardId> {

    /**
     * Creates a new instance.
     */
    PersonCreditCardRepository_SpringBootIT() {
        super(PersonCreditCardRepository.class, PersonCreditCard.class, MappedPersonCreditCardId.class);
    }
}
