package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.Color;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Color}, the {@code Warehouse.Colors} table of WideWorldImporters.
 * <p>
 * The id is {@link Integer}.
 *
 * @see Color
 */
@Repository
public interface ColorRepository
        extends _Repository<Color, Integer> {

}
