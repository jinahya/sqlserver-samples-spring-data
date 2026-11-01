package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.Address;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Address}, the {@code Person.Address} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Address
 */
@Repository
public interface AddressRepository
        extends _Repository<Address, Integer> {

}
