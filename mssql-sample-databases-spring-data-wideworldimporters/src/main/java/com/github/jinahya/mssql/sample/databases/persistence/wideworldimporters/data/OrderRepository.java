package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.Order;
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
