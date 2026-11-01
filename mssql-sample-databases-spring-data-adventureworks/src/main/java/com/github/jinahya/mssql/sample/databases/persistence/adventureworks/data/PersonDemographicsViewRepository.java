package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.PersonDemographicsView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link PersonDemographicsView}, the {@code Sales.vPersonDemographics} view of AdventureWorks.
 * <p>
 * The id is {@link Integer}.
 *
 * @see PersonDemographicsView
 */
@Repository
public interface PersonDemographicsViewRepository
        extends _Repository<PersonDemographicsView, Integer> {

}
