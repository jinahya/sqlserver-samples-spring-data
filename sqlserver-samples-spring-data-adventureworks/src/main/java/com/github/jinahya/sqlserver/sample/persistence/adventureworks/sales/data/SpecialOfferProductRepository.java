package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.SpecialOfferProductId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SpecialOfferProduct;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SpecialOfferProduct}, the {@code Sales.SpecialOfferProduct} table of AdventureWorks.
 * <p>
 * The id is {@link SpecialOfferProductId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see SpecialOfferProduct
 */
@Repository
public interface SpecialOfferProductRepository
        extends _Repository<SpecialOfferProduct, SpecialOfferProductId> {

}
