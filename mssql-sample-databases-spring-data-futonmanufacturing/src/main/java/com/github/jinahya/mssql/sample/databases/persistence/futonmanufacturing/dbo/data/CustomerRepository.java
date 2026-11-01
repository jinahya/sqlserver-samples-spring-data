package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.Customer;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Customer}, the {@code dbo.Customer} table of FutonManufacturing.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Customer
 */
@Repository
public interface CustomerRepository
        extends _Repository<Customer, Integer> {

}
