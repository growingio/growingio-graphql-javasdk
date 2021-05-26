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
final public class $UpdateUserDataCenterPermissionsMutationResolver implements UpdateUserDataCenterPermissionsMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateUserDataCenterPermissionsMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateUserDataCenterPermissionsMutationResolver() {}

    @Override
    public Boolean updateUserDataCenterPermissions(String userId, String roleId, java.util.List<String> permissions) throws Exception {
        UpdateUserDataCenterPermissionsMutationRequest request = new UpdateUserDataCenterPermissionsMutationRequest();
        List<String> keys = Arrays.asList("userId", "roleId", "permissions");
        List<?> values = Arrays.asList(userId, roleId, permissions);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        UpdateUserDataCenterPermissionsMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateUserDataCenterPermissionsMutationResponse.class);
        return result.updateUserDataCenterPermissions();
    }

}