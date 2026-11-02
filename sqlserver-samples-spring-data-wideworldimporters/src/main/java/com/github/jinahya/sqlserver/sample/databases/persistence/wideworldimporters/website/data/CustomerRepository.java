package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.website.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.website.Customer;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Customer}, the {@code Website.Customers} view of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 * <p>
 * The bean is named {@code websiteCustomerRepository}, not after the interface: another schema of this module has a
 * {@code CustomerRepository} too, and Spring Data names a repository bean after its simple name.
 *
 * @see Customer
 */
@Repository("websiteCustomerRepository")
public interface CustomerRepository
        extends _Repository<Customer, Integer> {

}
