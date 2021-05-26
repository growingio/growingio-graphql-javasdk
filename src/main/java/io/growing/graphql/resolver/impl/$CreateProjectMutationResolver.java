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
final public class $CreateProjectMutationResolver implements CreateProjectMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateProjectMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateProjectMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public ProjectDto createProject(ProjectInputDto project) throws Exception {
        CreateProjectMutationRequest request = new CreateProjectMutationRequest();
        List<String> keys = Arrays.asList("project");
        List<?> values = Arrays.asList(project);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        ProjectResponseProjection projection = new ProjectResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateProjectMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateProjectMutationResponse.class);
        return result.createProject();
    }

}