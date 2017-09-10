/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.api.publisher;

import org.wso2.carbon.apimgt.rest.integration.tests.publisher.ApiException;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.EndPoint;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.EndPointList;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.Error;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.api.EndpointCollectionApi;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for EndpointCollectionApi
 */
@Ignore
public class EndpointCollectionApiIT {

    private final EndpointCollectionApi api = new EndpointCollectionApi();

    
    /**
     * Get all endpoints
     *
     * This operation can be used to retrieve the list of endpoints available. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void endpointsGetTest() throws ApiException {
        String ifNoneMatch = null;
        String ifModifiedSince = null;
        EndPointList response = api.endpointsGet(ifNoneMatch, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * Check given Endpoint is already exist 
     *
     * Using this operation, you can check a given Endpoint name is already used. You need to provide the name you want to check. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void endpointsHeadTest() throws ApiException {
        String name = null;
        String ifNoneMatch = null;
        api.endpointsHead(name, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Add a new endpoint
     *
     * This operation can be used to add a new endpoint. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void endpointsPostTest() throws ApiException {
        EndPoint body = null;
        String ifNoneMatch = null;
        String ifModifiedSince = null;
        EndPoint response = api.endpointsPost(body, ifNoneMatch, ifModifiedSince);

        // TODO: test validations
    }
    
}
