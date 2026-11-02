package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_SpringBootIT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.Document;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.DocumentRepository;

/**
 * Tests {@link DocumentRepository} against AdventureWorks, through {@link _Repository_SpringBootIT}.
 * <p>
 * See that class for the context and the transactions. Needs the database of {@code application.yaml} up, with
 * AdventureWorks loaded; see that file.
 */
class DocumentRepository_SpringBootIT
        extends _Repository_SpringBootIT<DocumentRepository, Document, String> {

    /**
     * Creates a new instance.
     */
    DocumentRepository_SpringBootIT() {
        super(DocumentRepository.class, Document.class, String.class);
    }
}
