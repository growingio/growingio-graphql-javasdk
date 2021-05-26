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
final public class $StatusSubscriptionResolver implements StatusSubscriptionResolver {

    private GrowingIOConfig growingIOConfig;

    public $StatusSubscriptionResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $StatusSubscriptionResolver() {}

    @Override
    public String status() throws Exception {
        StatusSubscriptionRequest request = new StatusSubscriptionRequest();
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        StatusSubscriptionResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, StatusSubscriptionResponse.class);
        return result.status();
    }

}