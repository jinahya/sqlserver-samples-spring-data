package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.Customer;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Customer}, the {@code Sales.Customer} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Customer
 */
@Repository
public interface CustomerRepository
        extends _Repository<Customer, Integer> {

}
