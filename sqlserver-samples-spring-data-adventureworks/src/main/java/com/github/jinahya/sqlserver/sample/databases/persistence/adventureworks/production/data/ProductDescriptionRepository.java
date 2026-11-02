package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.ProductDescription;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ProductDescription}, the {@code Production.ProductDescription} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see ProductDescription
 */
@Repository
public interface ProductDescriptionRepository
        extends _Repository<ProductDescription, Integer> {

}
