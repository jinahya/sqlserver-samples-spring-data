package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.PackageType;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.data.PackageTypeRepository;

/**
 * Tests {@link PackageTypeRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class PackageTypeRepository_SpringBootIT
        extends _Repository_SpringBootIT<PackageTypeRepository, PackageType, Integer> {

    /**
     * Creates a new instance.
     */
    PackageTypeRepository_SpringBootIT() {
        super(PackageTypeRepository.class, PackageType.class, Integer.class);
    }
}
