package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.Customer;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Customer}, the {@code Sales.Customers} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Customer
 */
@Repository
public interface SalesCustomerRepository
        extends _Repository<Customer, Integer> {

}
