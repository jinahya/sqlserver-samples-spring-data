package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.CostRollUpView;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.CostRollUpViewRepository;

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
