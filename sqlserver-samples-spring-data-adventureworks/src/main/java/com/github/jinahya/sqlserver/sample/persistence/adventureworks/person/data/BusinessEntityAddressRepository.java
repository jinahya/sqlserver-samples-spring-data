package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.person.MappedBusinessEntityAddressId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.BusinessEntityAddress;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link BusinessEntityAddress}, the {@code Person.BusinessEntityAddress} table of AdventureWorks.
 * <p>
 * The id is {@link MappedBusinessEntityAddressId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see BusinessEntityAddress
 */
@Repository
public interface BusinessEntityAddressRepository
        extends _Repository<BusinessEntityAddress, MappedBusinessEntityAddressId> {

}
