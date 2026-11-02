package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data;

import com.github.jinahya.persistence.test.util.JinahyaPersistenceTestUtils;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.___Spring_TestContext;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assumptions.assumeThat;

/**
 * The base of the tests that run a repository against FutonManufacturing, through the full context of
 * {@link ___Spring_TestContext}.
 * <p>
 * A {@code @SpringBootTest} neither swaps in an embedded database nor wraps a test in a rolled-back transaction. Each
 * repository call runs in its own transaction, and in a persistence context of its own, and commits, unless the test
 * itself is {@code @Transactional}; then Spring's test support runs it in one transaction, and rolls that back.
 * <p>
 * It declares no tests yet. Needs the database of {@code application.yaml} up, with FutonManufacturing loaded; see that
 * file.
 *
 * @param <T> the type of the repository under test.
 * @param <U> the type of the entity the repository manages.
 * @param <V> the type of the entity's id.
 */
@SpringBootTest
public abstract class _Repository_SpringBootIT<T extends _Repository<U, V>, U, V>
        extends __Repository_TestBase<T, U, V> {

    /**
     * Creates a new instance for the specified types.
     *
     * @param repositoryClass the class of the repository under test.
     * @param entityClass     the class of the entity the repository manages.
     * @param idClass         the class of the entity's id.
     */
    protected _Repository_SpringBootIT(final Class<T> repositoryClass, final Class<U> entityClass,
                                       final Class<V> idClass) {
        super(repositoryClass, entityClass, idClass);
    }

    // -----------------------------------------------------------------------------------------------------------------

    /**
     * Selects a random entity of the {@link #entityClass}, through the injected entity manager.
     *
     * @return a random entity, or an empty optional if the table holds none.
     */
    protected Optional<U> selectRandom() {
        return JinahyaPersistenceTestUtils.selectRandom(entityManager(), entityClass);
    }

    /**
     * Selects a random entity of the {@link #entityClass}, and aborts the calling test if the table holds none.
     * <p>
     * An empty table is a missing fixture, not wrong behaviour, so the test is skipped by an assumption rather than
     * failed.
     *
     * @return a random entity.
     */
    protected U selectRandomPresent() {
        final var selected = selectRandom();
        assumeThat(selected).isNotEmpty();
        return selected.get();
    }
}
