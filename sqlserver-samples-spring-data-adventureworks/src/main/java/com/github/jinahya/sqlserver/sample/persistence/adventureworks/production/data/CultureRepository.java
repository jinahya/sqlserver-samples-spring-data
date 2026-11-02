package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.Culture;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Culture}, the {@code Production.Culture} table of AdventureWorks.
 * <p>
 * The id is {@link String}.
 *
 * @see Culture
 */
@Repository
public interface CultureRepository
        extends _Repository<Culture, String> {

}
