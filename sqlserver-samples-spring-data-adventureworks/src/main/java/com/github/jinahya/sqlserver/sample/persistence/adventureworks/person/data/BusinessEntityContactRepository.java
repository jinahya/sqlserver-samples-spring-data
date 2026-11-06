package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.person.BusinessEntityContactId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.BusinessEntityContact;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link BusinessEntityContact}, the {@code Person.BusinessEntityContact} table of AdventureWorks.
 * <p>
 * The id is {@link BusinessEntityContactId}, upstream's {@code @Embeddable} id class, which the entity maps with
 * {@code @EmbeddedId}.
 *
 * @see BusinessEntityContact
 */
@Repository
public interface BusinessEntityContactRepository
        extends _Repository<BusinessEntityContact, BusinessEntityContactId> {

}
