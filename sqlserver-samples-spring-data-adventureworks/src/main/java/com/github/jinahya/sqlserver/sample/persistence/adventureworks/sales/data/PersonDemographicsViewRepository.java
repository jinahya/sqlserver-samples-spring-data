package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.PersonDemographicsView;
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
