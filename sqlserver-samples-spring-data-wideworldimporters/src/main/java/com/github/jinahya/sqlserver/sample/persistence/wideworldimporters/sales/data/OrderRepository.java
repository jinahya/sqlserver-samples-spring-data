package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.Order;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Order}, the {@code Sales.Orders} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Order
 */
@Repository
public interface OrderRepository
        extends _Repository<Order, Integer> {

}
