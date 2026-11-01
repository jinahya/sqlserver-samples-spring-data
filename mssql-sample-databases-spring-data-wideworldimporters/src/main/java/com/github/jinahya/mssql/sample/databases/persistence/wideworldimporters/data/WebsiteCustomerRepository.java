package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.website.Customer;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Customer}, the {@code Website.Customers} view of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Customer
 */
@Repository
public interface WebsiteCustomerRepository
        extends _Repository<Customer, Integer> {

}
