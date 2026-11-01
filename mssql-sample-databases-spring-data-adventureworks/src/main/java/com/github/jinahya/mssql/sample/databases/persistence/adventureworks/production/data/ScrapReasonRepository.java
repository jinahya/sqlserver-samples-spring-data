package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ScrapReason;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link ScrapReason}, the {@code Production.ScrapReason} table of AdventureWorks.
 * <p>
 * The id is {@link Short}.
 *
 * @see ScrapReason
 */
@Repository
public interface ScrapReasonRepository
        extends _Repository<ScrapReason, Short> {

}
