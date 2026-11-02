package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.CostRollUpView;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link CostRollUpView}, the {@code dbo.vw_CostRollUp} view of FutonManufacturing.
 * <p>
 * The id is {@link String}.
 *
 * @see CostRollUpView
 */
@Repository
public interface CostRollUpViewRepository
        extends _Repository<CostRollUpView, String> {

}
