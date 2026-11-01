package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.SpecialDeal;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SpecialDeal}, the {@code Sales.SpecialDeals} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SpecialDeal
 */
@Repository
public interface SpecialDealRepository
        extends _Repository<SpecialDeal, Integer> {

}
