package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.person.MappedBusinessEntityContactId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.BusinessEntityContact;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link BusinessEntityContact}, the {@code Person.BusinessEntityContact} table of AdventureWorks.
 * <p>
 * The id is {@link MappedBusinessEntityContactId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see BusinessEntityContact
 */
@Repository
public interface BusinessEntityContactRepository
        extends _Repository<BusinessEntityContact, MappedBusinessEntityContactId> {

}
