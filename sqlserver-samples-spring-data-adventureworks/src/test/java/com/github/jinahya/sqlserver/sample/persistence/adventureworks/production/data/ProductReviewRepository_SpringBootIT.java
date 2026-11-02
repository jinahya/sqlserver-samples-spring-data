package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductReview;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.ProductReviewRepository;

/**
 * Tests {@link ProductReviewRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class ProductReviewRepository_SpringBootIT
        extends _Repository_SpringBootIT<ProductReviewRepository, ProductReview, Integer> {

    /**
     * Creates a new instance.
     */
    ProductReviewRepository_SpringBootIT() {
        super(ProductReviewRepository.class, ProductReview.class, Integer.class);
    }
}
