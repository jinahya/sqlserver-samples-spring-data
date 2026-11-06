package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.PersonCreditCardId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.PersonCreditCard;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link PersonCreditCard}, the {@code Sales.PersonCreditCard} table of AdventureWorks.
 * <p>
 * The id is {@link PersonCreditCardId}, upstream's {@code @Embeddable} id class, which the entity maps with
 * {@code @EmbeddedId}.
 *
 * @see PersonCreditCard
 */
@Repository
public interface PersonCreditCardRepository
        extends _Repository<PersonCreditCard, PersonCreditCardId> {

}
