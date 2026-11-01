package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.sales.MappedSpecialOfferProductId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SpecialOfferProduct;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SpecialOfferProduct}, the {@code Sales.SpecialOfferProduct} table of AdventureWorks.
 * <p>
 * The id is {@link MappedSpecialOfferProductId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see SpecialOfferProduct
 */
@Repository
public interface SpecialOfferProductRepository
        extends _Repository<SpecialOfferProduct, MappedSpecialOfferProductId> {

}
