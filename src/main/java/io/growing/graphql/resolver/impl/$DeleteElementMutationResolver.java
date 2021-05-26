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
 * 无埋点 删除元素
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $DeleteElementMutationResolver implements DeleteElementMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $DeleteElementMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DeleteElementMutationResolver() {}

    /**
     * 无埋点 删除元素
     */
    @Override
    public Boolean deleteElement(String projectId, String id) throws Exception {
        DeleteElementMutationRequest request = new DeleteElementMutationRequest();
        List<String> keys = Arrays.asList("projectId", "id");
        List<?> values = Arrays.asList(projectId, id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        DeleteElementMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DeleteElementMutationResponse.class);
        return result.deleteElement();
    }

}