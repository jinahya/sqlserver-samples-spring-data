package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.Promotion;

/**
 * Tests {@link PromotionRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class PromotionRepository_SpringBootIT
        extends _Repository_SpringBootIT<PromotionRepository, Promotion, Integer> {

    /**
     * Creates a new instance.
     */
    PromotionRepository_SpringBootIT() {
        super(PromotionRepository.class, Promotion.class, Integer.class);
    }
}
