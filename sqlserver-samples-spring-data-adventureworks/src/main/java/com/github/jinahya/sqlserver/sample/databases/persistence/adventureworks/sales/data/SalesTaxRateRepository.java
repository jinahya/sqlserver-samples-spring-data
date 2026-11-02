package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.SalesTaxRate;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesTaxRate}, the {@code Sales.SalesTaxRate} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SalesTaxRate
 */
@Repository
public interface SalesTaxRateRepository
        extends _Repository<SalesTaxRate, Integer> {

}
