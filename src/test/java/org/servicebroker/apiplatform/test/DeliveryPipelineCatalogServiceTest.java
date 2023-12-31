package org.servicebroker.apiplatform.test;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Spy;
import org.openpaas.servicebroker.model.Catalog;
import org.openpaas.servicebroker.model.ServiceDefinition;
import org.servicebroker.apiplatform.common.TestConstants;
import org.servicebroker.apiplatform.model.ServiceDefinitionFixture;
import org.servicebroker.deliverypipeline.service.impl.DeliveryPipelineCatalogService;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DeliveryPipelineCatalogServiceTest {

    @Spy
    DeliveryPipelineCatalogService deliveryPipelineCatalogService;

    @Mock
    Catalog catalog;


    @Test
    public void test_getCatalog() throws Exception {

        catalog = new Catalog(ServiceDefinitionFixture.getCatalog());
        deliveryPipelineCatalogService = new DeliveryPipelineCatalogService(catalog);

        Catalog result = deliveryPipelineCatalogService.getCatalog();

        assertThat(result.getServiceDefinitions().get(0).getId(), is(TestConstants.SERVICEDEFINITION_ID));
        assertThat(result.getServiceDefinitions().get(0).getName(), is(TestConstants.SERVICEDEFINITION_NAME));
        assertThat(result.getServiceDefinitions().get(0).isBindable(), is(false));
        assertThat(result.getServiceDefinitions().get(0).isPlanUpdatable(), is(false));

        ServiceDefinition serviceDefinition = deliveryPipelineCatalogService.getServiceDefinition(TestConstants.SERVICEDEFINITION_ID);
        assertThat(serviceDefinition.getId(), is(TestConstants.SERVICEDEFINITION_ID));
        assertThat(serviceDefinition.getName(), is(TestConstants.SERVICEDEFINITION_NAME));
        assertThat(serviceDefinition.isBindable(), is(false));
        assertThat(serviceDefinition.isPlanUpdatable(), is(false));

    }
}
