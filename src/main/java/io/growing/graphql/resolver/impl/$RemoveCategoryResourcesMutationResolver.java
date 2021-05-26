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

/**
 * 删除分类内资源
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $RemoveCategoryResourcesMutationResolver implements RemoveCategoryResourcesMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $RemoveCategoryResourcesMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $RemoveCategoryResourcesMutationResolver() {}

    /**
     * 删除分类内资源
     */
    @Override
    public Boolean removeCategoryResources(java.util.List<CategoryResourceInputDto> categoryResources) throws Exception {
        RemoveCategoryResourcesMutationRequest request = new RemoveCategoryResourcesMutationRequest();
        List<String> keys = Arrays.asList("categoryResources");
        List<?> values = Arrays.asList(categoryResources);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        RemoveCategoryResourcesMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, RemoveCategoryResourcesMutationResponse.class);
        return result.removeCategoryResources();
    }

}