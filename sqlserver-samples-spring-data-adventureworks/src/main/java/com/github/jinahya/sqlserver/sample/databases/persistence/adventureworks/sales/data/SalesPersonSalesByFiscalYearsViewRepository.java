package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.SalesPersonSalesByFiscalYearsView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link SalesPersonSalesByFiscalYearsView}, the {@code Sales.vSalesPersonSalesByFiscalYears} view of
 * AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see SalesPersonSalesByFiscalYearsView
 */
@Repository
public interface SalesPersonSalesByFiscalYearsViewRepository
        extends _Repository<SalesPersonSalesByFiscalYearsView, Integer> {

}
