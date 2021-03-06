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
final public class $NameSubscriptionResolver implements NameSubscriptionResolver {

    private GrowingIOConfig growingIOConfig;

    public $NameSubscriptionResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $NameSubscriptionResolver() {}

    @Override
    public String name() throws Exception {
        NameSubscriptionRequest request = new NameSubscriptionRequest();
        NamedEntityResponseProjection projection = new NamedEntityResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        NameSubscriptionResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, NameSubscriptionResponse.class);
        return result.name();
    }

}