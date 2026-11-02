package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.StockGroup;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link StockGroup}, the {@code Warehouse.StockGroups} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see StockGroup
 */
@Repository
public interface StockGroupRepository
        extends _Repository<StockGroup, Integer> {

}
