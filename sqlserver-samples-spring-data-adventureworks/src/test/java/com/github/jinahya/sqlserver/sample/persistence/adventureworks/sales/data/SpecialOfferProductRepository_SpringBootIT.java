package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.MappedSpecialOfferProductId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SpecialOfferProduct;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data.SpecialOfferProductRepository;

/**
 * Tests {@link SpecialOfferProductRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class SpecialOfferProductRepository_SpringBootIT
        extends _Repository_SpringBootIT<SpecialOfferProductRepository, SpecialOfferProduct,
                                         MappedSpecialOfferProductId> {

    /**
     * Creates a new instance.
     */
    SpecialOfferProductRepository_SpringBootIT() {
        super(SpecialOfferProductRepository.class, SpecialOfferProduct.class, MappedSpecialOfferProductId.class);
    }
}
