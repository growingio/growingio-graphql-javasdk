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
final public class $DeleteRetentionAnalysisMutationResolver implements DeleteRetentionAnalysisMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $DeleteRetentionAnalysisMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DeleteRetentionAnalysisMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public Boolean deleteRetentionAnalysis(String projectId, String id) throws Exception {
        DeleteRetentionAnalysisMutationRequest request = new DeleteRetentionAnalysisMutationRequest();
        List<String> keys = Arrays.asList("projectId", "id");
        List<?> values = Arrays.asList(projectId, id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        DeleteRetentionAnalysisMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DeleteRetentionAnalysisMutationResponse.class);
        return result.deleteRetentionAnalysis();
    }

}