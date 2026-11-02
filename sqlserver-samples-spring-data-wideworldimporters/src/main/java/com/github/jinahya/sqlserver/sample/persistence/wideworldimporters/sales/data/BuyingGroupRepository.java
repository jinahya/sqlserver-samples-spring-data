package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.BuyingGroup;
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
