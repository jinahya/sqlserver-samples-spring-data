package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.warehouse.PackageType;
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
