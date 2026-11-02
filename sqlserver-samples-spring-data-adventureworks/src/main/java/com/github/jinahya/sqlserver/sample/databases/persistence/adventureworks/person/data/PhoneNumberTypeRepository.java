package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.PhoneNumberType;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link PhoneNumberType}, the {@code Person.PhoneNumberType} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see PhoneNumberType
 */
@Repository
public interface PhoneNumberTypeRepository
        extends _Repository<PhoneNumberType, Integer> {

}
