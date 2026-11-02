package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.BusinessEntity;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link BusinessEntity}, the {@code Person.BusinessEntity} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see BusinessEntity
 */
@Repository
public interface BusinessEntityRepository
        extends _Repository<BusinessEntity, Integer> {

}
