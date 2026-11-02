package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.QualityInspection;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.QualityInspectionRepository;

/**
 * Tests {@link QualityInspectionRepository} against FutonManufacturing, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * FutonManufacturing loaded; see that file.
 */
class QualityInspectionRepository_SpringBootIT
        extends _Repository_SpringBootIT<QualityInspectionRepository, QualityInspection, Integer> {

    /**
     * Creates a new instance.
     */
    QualityInspectionRepository_SpringBootIT() {
        super(QualityInspectionRepository.class, QualityInspection.class, Integer.class);
    }
}
