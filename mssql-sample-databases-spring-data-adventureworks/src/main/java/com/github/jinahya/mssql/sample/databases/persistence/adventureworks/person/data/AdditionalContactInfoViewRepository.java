package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.AdditionalContactInfoView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link AdditionalContactInfoView}, the {@code Person.vAdditionalContactInfo} view of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see AdditionalContactInfoView
 */
@Repository
public interface AdditionalContactInfoViewRepository
        extends _Repository<AdditionalContactInfoView, Integer> {

}
