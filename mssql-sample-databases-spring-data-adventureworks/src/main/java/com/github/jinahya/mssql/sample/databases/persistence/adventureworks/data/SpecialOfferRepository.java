package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SpecialOffer;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SpecialOffer}, the {@code Sales.SpecialOffer} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SpecialOffer
 */
@Repository
public interface SpecialOfferRepository
        extends _Repository<SpecialOffer, Integer> {

}
