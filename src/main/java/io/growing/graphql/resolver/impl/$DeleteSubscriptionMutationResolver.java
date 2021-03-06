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
final public class $DeleteSubscriptionMutationResolver implements DeleteSubscriptionMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $DeleteSubscriptionMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DeleteSubscriptionMutationResolver() {}

    @Override
    public Boolean deleteSubscription(String projectId, SubscriptionTypeDto type, String id) throws Exception {
        DeleteSubscriptionMutationRequest request = new DeleteSubscriptionMutationRequest();
        List<String> keys = Arrays.asList("projectId", "type", "id");
        List<?> values = Arrays.asList(projectId, type, id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        DeleteSubscriptionMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DeleteSubscriptionMutationResponse.class);
        return result.deleteSubscription();
    }

}