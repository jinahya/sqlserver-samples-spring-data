package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.Color;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.data.ColorRepository;

/**
 * Tests {@link ColorRepository} against WideWorldImporters, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * WideWorldImporters loaded; see that file.
 */
class ColorRepository_SpringBootIT
        extends _Repository_SpringBootIT<ColorRepository, Color, Integer> {

    /**
     * Creates a new instance.
     */
    ColorRepository_SpringBootIT() {
        super(ColorRepository.class, Color.class, Integer.class);
    }
}
