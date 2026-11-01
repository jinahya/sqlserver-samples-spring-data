package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.Illustration;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Illustration}, the {@code Production.Illustration} table of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Illustration
 */
@Repository
public interface IllustrationRepository
        extends _Repository<Illustration, Integer> {

}
