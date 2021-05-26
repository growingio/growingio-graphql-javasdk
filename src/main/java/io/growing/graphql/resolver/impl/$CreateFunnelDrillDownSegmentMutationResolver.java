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
final public class $CreateFunnelDrillDownSegmentMutationResolver implements CreateFunnelDrillDownSegmentMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $CreateFunnelDrillDownSegmentMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CreateFunnelDrillDownSegmentMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public DrillDownSegmentReplyDto createFunnelDrillDownSegment(String projectId, FunnelDrillDownSegmentInputDto funnelDrillDownSegment) throws Exception {
        CreateFunnelDrillDownSegmentMutationRequest request = new CreateFunnelDrillDownSegmentMutationRequest();
        List<String> keys = Arrays.asList("projectId", "funnelDrillDownSegment");
        List<?> values = Arrays.asList(projectId, funnelDrillDownSegment);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        DrillDownSegmentReplyResponseProjection projection = new DrillDownSegmentReplyResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateFunnelDrillDownSegmentMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateFunnelDrillDownSegmentMutationResponse.class);
        return result.createFunnelDrillDownSegment();
    }

}