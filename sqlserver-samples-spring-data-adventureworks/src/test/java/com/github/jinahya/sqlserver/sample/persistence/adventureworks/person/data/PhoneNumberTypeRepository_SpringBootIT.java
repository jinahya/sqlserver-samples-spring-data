package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.PhoneNumberType;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data.PhoneNumberTypeRepository;

/**
 * Tests {@link PhoneNumberTypeRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class PhoneNumberTypeRepository_SpringBootIT
        extends _Repository_SpringBootIT<PhoneNumberTypeRepository, PhoneNumberType, Integer> {

    /**
     * Creates a new instance.
     */
    PhoneNumberTypeRepository_SpringBootIT() {
        super(PhoneNumberTypeRepository.class, PhoneNumberType.class, Integer.class);
    }
}
