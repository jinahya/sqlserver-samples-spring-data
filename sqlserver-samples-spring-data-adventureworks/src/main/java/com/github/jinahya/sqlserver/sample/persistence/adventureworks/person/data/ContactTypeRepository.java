package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.ContactType;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ContactType}, the {@code Person.ContactType} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see ContactType
 */
@Repository
public interface ContactTypeRepository
        extends _Repository<ContactType, Integer> {

}
