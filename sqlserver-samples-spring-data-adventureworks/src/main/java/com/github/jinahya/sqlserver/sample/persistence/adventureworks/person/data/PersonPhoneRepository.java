package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.person.PersonPhoneId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.PersonPhone;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link PersonPhone}, the {@code Person.PersonPhone} table of AdventureWorks.
 * <p>
 * The id is {@link PersonPhoneId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see PersonPhone
 */
@Repository
public interface PersonPhoneRepository
        extends _Repository<PersonPhone, PersonPhoneId> {

}
