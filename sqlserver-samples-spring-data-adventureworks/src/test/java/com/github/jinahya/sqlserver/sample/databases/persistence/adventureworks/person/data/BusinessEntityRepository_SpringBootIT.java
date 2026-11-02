package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.BusinessEntity;

/**
 * Tests {@link BusinessEntityRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class BusinessEntityRepository_SpringBootIT
        extends _Repository_SpringBootIT<BusinessEntityRepository, BusinessEntity, Integer> {

    /**
     * Creates a new instance.
     */
    BusinessEntityRepository_SpringBootIT() {
        super(BusinessEntityRepository.class, BusinessEntity.class, Integer.class);
    }
}
