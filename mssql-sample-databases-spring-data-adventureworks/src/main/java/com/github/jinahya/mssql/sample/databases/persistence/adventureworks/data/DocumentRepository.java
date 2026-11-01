package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.Document;
import org.springframework.stereotype.Repository;

/**
 * A repository for {@link Document}, the {@code Production.Document} table of AdventureWorks.
 * <p>
 * The id is {@link String}.
 *
 * @see Document
 */
@Repository
public interface DocumentRepository
        extends _Repository<Document, String> {

}
