package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.PaymentMethod;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link PaymentMethod}, the {@code Application.PaymentMethods} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see PaymentMethod
 */
@Repository
public interface PaymentMethodRepository
        extends _Repository<PaymentMethod, Integer> {

}
