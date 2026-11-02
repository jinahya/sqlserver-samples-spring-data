package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.Product;
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
