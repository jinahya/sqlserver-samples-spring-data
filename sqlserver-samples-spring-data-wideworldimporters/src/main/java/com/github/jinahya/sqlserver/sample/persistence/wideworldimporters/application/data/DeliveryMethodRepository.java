package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.application.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.application.DeliveryMethod;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository;
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
