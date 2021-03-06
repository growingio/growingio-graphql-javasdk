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
    date = "2020-12-22T15:45:58+0800"
)
final public class $BatchDeleteFrequencyAnalysesMutationResolver implements BatchDeleteFrequencyAnalysesMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $BatchDeleteFrequencyAnalysesMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $BatchDeleteFrequencyAnalysesMutationResolver() {}

    @Override
    public Boolean batchDeleteFrequencyAnalyses(String projectId, java.util.List<String> ids) throws Exception {
        BatchDeleteFrequencyAnalysesMutationRequest request = new BatchDeleteFrequencyAnalysesMutationRequest();
        List<String> keys = Arrays.asList("projectId", "ids");
        List<?> values = Arrays.asList(projectId, ids);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        BatchDeleteFrequencyAnalysesMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, BatchDeleteFrequencyAnalysesMutationResponse.class);
        return result.batchDeleteFrequencyAnalyses();
    }

}