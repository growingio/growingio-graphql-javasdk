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
final public class $CreateDataCenterItemVariableMutationResolver implements CreateDataCenterItemVariableMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateDataCenterItemVariableMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateDataCenterItemVariableMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public ItemVariableDto createDataCenterItemVariable(VariableInputDto itemVariable) throws Exception {
        CreateDataCenterItemVariableMutationRequest request = new CreateDataCenterItemVariableMutationRequest();
        List<String> keys = Arrays.asList("itemVariable");
        List<?> values = Arrays.asList(itemVariable);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        ItemVariableResponseProjection projection = new ItemVariableResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateDataCenterItemVariableMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateDataCenterItemVariableMutationResponse.class);
        return result.createDataCenterItemVariable();
    }

}