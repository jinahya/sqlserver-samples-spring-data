package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.BuyingGroup;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link BuyingGroup}, the {@code Sales.BuyingGroups} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see BuyingGroup
 */
@Repository
public interface BuyingGroupRepository
        extends _Repository<BuyingGroup, Integer> {

}
