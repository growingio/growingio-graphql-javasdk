package io.growing.graphql.resolver.impl;

import com.kobylynskyi.graphql.codegen.extension.GrowingIOConfig;
import com.kobylynskyi.graphql.codegen.extension.utils.JavaCollectionUtils;
import com.kobylynskyi.graphql.codegen.extension.utils.OkHttpUtils;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import io.growing.graphql.resolver.*;
import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
final public class $PersonaMeasurementsQueryResolver implements PersonaMeasurementsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $PersonaMeasurementsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $PersonaMeasurementsQueryResolver() {}

    @Override
    public java.util.List<MeasurementDto> personaMeasurements(String projectId) throws Exception {
        PersonaMeasurementsQueryRequest request = new PersonaMeasurementsQueryRequest();
        List<String> keys = Arrays.asList("projectId");
        List<?> values = Arrays.asList(projectId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        MeasurementResponseProjection projection = new MeasurementResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        PersonaMeasurementsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, PersonaMeasurementsQueryResponse.class);
        return result.personaMeasurements();
    }

}