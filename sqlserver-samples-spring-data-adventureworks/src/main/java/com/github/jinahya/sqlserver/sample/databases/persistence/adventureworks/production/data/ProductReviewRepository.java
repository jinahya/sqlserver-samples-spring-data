package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.ProductReview;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ProductReview}, the {@code Production.ProductReview} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see ProductReview
 */
@Repository
public interface ProductReviewRepository
        extends _Repository<ProductReview, Integer> {

}
