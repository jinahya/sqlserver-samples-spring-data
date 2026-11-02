package com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.purchasing.MappedProductVendorId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.ProductVendor;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ProductVendor}, the {@code Purchasing.ProductVendor} table of AdventureWorks.
 * <p>
 * The id is {@link MappedProductVendorId}, upstream's id class, which the entity names with {@code @IdClass}.
 *
 * @see ProductVendor
 */
@Repository
public interface ProductVendorRepository
        extends _Repository<ProductVendor, MappedProductVendorId> {

}
