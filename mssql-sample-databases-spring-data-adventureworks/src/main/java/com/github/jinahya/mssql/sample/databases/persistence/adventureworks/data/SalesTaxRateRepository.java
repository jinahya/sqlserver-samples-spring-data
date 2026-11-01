package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SalesTaxRate;
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
