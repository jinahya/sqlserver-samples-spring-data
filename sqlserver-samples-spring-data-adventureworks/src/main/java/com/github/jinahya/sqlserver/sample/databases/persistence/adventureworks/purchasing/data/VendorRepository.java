package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.purchasing.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.purchasing.Vendor;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Vendor}, the {@code Purchasing.Vendor} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Vendor
 */
@Repository
public interface VendorRepository
        extends _Repository<Vendor, Integer> {

}
