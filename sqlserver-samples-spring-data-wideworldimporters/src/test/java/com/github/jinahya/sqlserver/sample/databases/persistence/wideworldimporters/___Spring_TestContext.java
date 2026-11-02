package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.application.City;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.purchasing.PurchaseOrder;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.sales.BuyingGroup;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.ColdRoomTemperature;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.website.Customer;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

/**
 * The Spring context the tests of this module boot against.
 * <p>
 * It lives in test sources on purpose: this module publishes repositories, not an application, so nothing in
 * {@code src/main} should carry a {@code @SpringBootApplication}. A {@code @SpringBootTest} finds this by walking up
 * from its own package, so the tests of every {@code <schema>.data} package below need no {@code classes} attribute.
 * That is why this is here, in the module's root package, and not in {@code data}, which no {@code <schema>.data}
 * package is under.
 * <p>
 * Auto-configuration takes this package as its base, so Spring Data finds the repositories of every
 * {@code <schema>.data} package. The {@code @EntityScan} names one entity of each schema package, so that the scan
 * covers the entities and nothing else (not upstream's {@code mapped} packages). The converter they name is found
 * through the mappings ({@code @Convert} on the mapped superclasses), so it needs no scan.
 */
@SpringBootConfiguration
@EnableAutoConfiguration
@EntityScan(basePackageClasses = {
        City.class,
        PurchaseOrder.class,
        BuyingGroup.class,
        ColdRoomTemperature.class,
        Customer.class
})
public class ___Spring_TestContext {

}
