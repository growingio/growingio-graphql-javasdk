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
final public class $UserProfileQueryResolver implements UserProfileQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $UserProfileQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UserProfileQueryResolver() {}

    @Override
    public UserProfileDto userProfile(String projectId, String userId, java.util.List<String> tags, java.util.List<String> properties) throws Exception {
        UserProfileQueryRequest request = new UserProfileQueryRequest();
        List<String> keys = Arrays.asList("projectId", "userId", "tags", "properties");
        List<?> values = Arrays.asList(projectId, userId, tags, properties);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        UserProfileResponseProjection projection = new UserProfileResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UserProfileQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UserProfileQueryResponse.class);
        return result.userProfile();
    }

}