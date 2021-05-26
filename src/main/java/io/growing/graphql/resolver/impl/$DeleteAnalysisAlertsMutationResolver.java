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
    date = "2021-05-26T15:01:24+0800"
)
final public class $DeleteAnalysisAlertsMutationResolver implements DeleteAnalysisAlertsMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $DeleteAnalysisAlertsMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DeleteAnalysisAlertsMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public Boolean deleteAnalysisAlerts(String projectId, java.util.List<String> ids) throws Exception {
        DeleteAnalysisAlertsMutationRequest request = new DeleteAnalysisAlertsMutationRequest();
        List<String> keys = Arrays.asList("projectId", "ids");
        List<?> values = Arrays.asList(projectId, ids);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        DeleteAnalysisAlertsMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DeleteAnalysisAlertsMutationResponse.class);
        return result.deleteAnalysisAlerts();
    }

}