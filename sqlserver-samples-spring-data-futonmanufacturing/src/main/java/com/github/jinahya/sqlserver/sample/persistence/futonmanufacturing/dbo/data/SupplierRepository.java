package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.Supplier;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Supplier}, the {@code dbo.Supplier} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Supplier
 */
@Repository
public interface SupplierRepository
        extends _Repository<Supplier, Integer> {

}
