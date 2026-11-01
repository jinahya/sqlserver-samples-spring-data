package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.purchasing.VendorWithAddressesView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link VendorWithAddressesView}, the {@code Purchasing.vVendorWithAddresses} view of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see VendorWithAddressesView
 */
@Repository
public interface VendorWithAddressesViewRepository
        extends _Repository<VendorWithAddressesView, Integer> {

}
