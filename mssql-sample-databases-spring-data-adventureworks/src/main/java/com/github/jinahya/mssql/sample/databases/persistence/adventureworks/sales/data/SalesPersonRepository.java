package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SalesPerson;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesPerson}, the {@code Sales.SalesPerson} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SalesPerson
 */
@Repository
public interface SalesPersonRepository
        extends _Repository<SalesPerson, Integer> {

}
