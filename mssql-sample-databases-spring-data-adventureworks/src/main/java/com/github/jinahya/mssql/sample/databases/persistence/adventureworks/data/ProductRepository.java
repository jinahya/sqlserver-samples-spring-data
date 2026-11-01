package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.Product;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Product}, the {@code Production.Product} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Product
 */
@Repository
public interface ProductRepository
        extends _Repository<Product, Integer> {

}
