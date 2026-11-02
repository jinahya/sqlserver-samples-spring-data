package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.AddressType;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link AddressType}, the {@code Person.AddressType} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see AddressType
 */
@Repository
public interface AddressTypeRepository
        extends _Repository<AddressType, Integer> {

}
