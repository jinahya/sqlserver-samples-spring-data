package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SpecialOffer;
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
