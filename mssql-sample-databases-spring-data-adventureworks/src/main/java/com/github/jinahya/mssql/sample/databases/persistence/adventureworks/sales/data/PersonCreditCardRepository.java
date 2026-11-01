package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.sales.MappedPersonCreditCardId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.PersonCreditCard;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link PersonCreditCard}, the {@code Sales.PersonCreditCard} table of AdventureWorks.
 * <p>
 * The id is {@link MappedPersonCreditCardId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see PersonCreditCard
 */
@Repository
public interface PersonCreditCardRepository
        extends _Repository<PersonCreditCard, MappedPersonCreditCardId> {

}
