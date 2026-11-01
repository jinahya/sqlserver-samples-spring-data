package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.BillOfMaterials;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

/**
 * The Spring context the tests of this module boot against.
 * <p>
 * It lives in test sources on purpose: this module publishes repositories, not an application, so nothing in
 * {@code src/main} should carry a {@code @SpringBootApplication}. A {@code @SpringBootTest} finds this by walking up
 * from its own package, so tests in this package and below need no {@code classes} attribute.
 * <p>
 * The entities are outside this package, in the sibling packages of the main sources, one per schema, so
 * auto-configuration would not find them; the {@code @EntityScan} names one entity of each. The converter they name
 * is found through the mappings ({@code @Convert} on the mapped superclasses), so it needs no scan.
 */
@SpringBootConfiguration
@EnableAutoConfiguration
@EntityScan(basePackageClasses = BillOfMaterials.class)
public class ___Spring_TestContext {

}
