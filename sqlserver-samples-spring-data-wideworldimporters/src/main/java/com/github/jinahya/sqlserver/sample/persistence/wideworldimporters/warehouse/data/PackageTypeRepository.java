package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.PackageType;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link PackageType}, the {@code Warehouse.PackageTypes} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see PackageType
 */
@Repository
public interface PackageTypeRepository
        extends _Repository<PackageType, Integer> {

}
