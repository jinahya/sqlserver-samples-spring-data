package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.DeliveryMethod;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link DeliveryMethod}, the {@code Application.DeliveryMethods} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see DeliveryMethod
 */
@Repository
public interface DeliveryMethodRepository
        extends _Repository<DeliveryMethod, Integer> {

}
