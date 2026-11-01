package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.CreditCard;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link CreditCard}, the {@code Sales.CreditCard} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see CreditCard
 */
@Repository
public interface CreditCardRepository
        extends _Repository<CreditCard, Integer> {

}
