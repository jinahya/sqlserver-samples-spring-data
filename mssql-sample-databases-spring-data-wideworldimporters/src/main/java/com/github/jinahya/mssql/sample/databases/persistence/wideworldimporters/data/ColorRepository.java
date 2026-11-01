package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.warehouse.Color;
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
