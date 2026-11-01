package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.UnitMeasure;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link UnitMeasure}, the {@code Production.UnitMeasure} table of AdventureWorks.
 * <p>
 * The id is {@link String}.
 *
 * @see UnitMeasure
 */
@Repository
public interface UnitMeasureRepository
        extends _Repository<UnitMeasure, String> {

}
