package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import jakarta.persistence.EntityManagerFactory;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests {@link ___Spring_TestContext}, in the full context.
 * <p>
 * Booting proves that the {@code @EntityScan} finds the entities in the sibling packages of this module.
 * <p>
 * It does <em>not</em> prove that the database is reachable. {@code application.yaml} names the dialect, so Hibernate
 * only logs a failed metadata connection and starts anyway. Nothing here runs a query, so this test passes with no
 * database at all. The first repository test that queries it will cover that.
 *
 * @see ___Spring_TestContext
 */
@SpringBootTest
@NoArgsConstructor(access = AccessLevel.PACKAGE)
class SpringTestContext_SpringBootTest {

    /**
     * Tests the metamodel of the persistence unit that {@link ___Spring_TestContext} configures.
     */
    @Nested
    class Metamodel_Test {

        /**
         * Asserts that the persistence unit holds all 50 entities of this module, among them the named ones, by
         * their entity names.
         * <p>
         * A view ({@code CostRollUpView}) is not named; the tables are enough to notice the scan missing the package.
         */
        @Test
        void __() {
            final var entities = entityManagerFactory.getMetamodel().getEntities();
            assertThat(entities)
                    .hasSize(50)
                    .extracting(t -> t.getName())
                    .contains("DboItem", "DboSalesOrder", "DboSalesOrderDetail");
        }
    }

    @Autowired
    private EntityManagerFactory entityManagerFactory;
}
