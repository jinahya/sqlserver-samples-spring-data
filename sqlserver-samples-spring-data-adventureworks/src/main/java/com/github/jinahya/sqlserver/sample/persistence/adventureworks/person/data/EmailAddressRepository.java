package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.person.EmailAddressId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.EmailAddress;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link EmailAddress}, the {@code Person.EmailAddress} table of AdventureWorks.
 * <p>
 * The id is {@link EmailAddressId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see EmailAddress
 */
@Repository
public interface EmailAddressRepository
        extends _Repository<EmailAddress, EmailAddressId> {

}
