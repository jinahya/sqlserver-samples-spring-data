package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.OrderLine;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link OrderLine}, the {@code Sales.OrderLines} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see OrderLine
 */
@Repository
public interface OrderLineRepository
        extends _Repository<OrderLine, Integer> {

}
