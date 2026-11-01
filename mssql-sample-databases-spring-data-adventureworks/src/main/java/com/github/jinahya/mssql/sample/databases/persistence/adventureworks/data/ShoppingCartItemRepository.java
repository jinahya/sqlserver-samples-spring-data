package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.ShoppingCartItem;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ShoppingCartItem}, the {@code Sales.ShoppingCartItem} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see ShoppingCartItem
 */
@Repository
public interface ShoppingCartItemRepository
        extends _Repository<ShoppingCartItem, Integer> {

}
