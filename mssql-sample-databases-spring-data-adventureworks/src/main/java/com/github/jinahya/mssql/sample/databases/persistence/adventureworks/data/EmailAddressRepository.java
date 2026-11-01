package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.person.MappedEmailAddressId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.EmailAddress;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link EmailAddress}, the {@code Person.EmailAddress} table of AdventureWorks.
 * <p>
 * The id is {@link MappedEmailAddressId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see EmailAddress
 */
@Repository
public interface EmailAddressRepository
        extends _Repository<EmailAddress, MappedEmailAddressId> {

}
