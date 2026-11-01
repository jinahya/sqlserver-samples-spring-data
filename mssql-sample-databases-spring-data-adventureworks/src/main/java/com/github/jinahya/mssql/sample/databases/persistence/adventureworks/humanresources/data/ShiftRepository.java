package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.Shift;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Shift}, the {@code HumanResources.Shift} table of AdventureWorks.
 * <p>
 * The id is {@link Short}.
 *
 * @see Shift
 */
@Repository
public interface ShiftRepository
        extends _Repository<Shift, Short> {

}
