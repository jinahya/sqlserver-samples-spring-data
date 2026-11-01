package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.CostRollUpView;

/**
 * Tests {@link CostRollUpViewRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class CostRollUpViewRepository_SpringBootIT
        extends _Repository_SpringBootIT<CostRollUpViewRepository, CostRollUpView, String> {

    /**
     * Creates a new instance.
     */
    CostRollUpViewRepository_SpringBootIT() {
        super(CostRollUpViewRepository.class, CostRollUpView.class, String.class);
    }
}
