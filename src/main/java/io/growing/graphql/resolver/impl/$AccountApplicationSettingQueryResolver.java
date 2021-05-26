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
final public class $AccountApplicationSettingQueryResolver implements AccountApplicationSettingQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $AccountApplicationSettingQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $AccountApplicationSettingQueryResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public AccountApplicationSettingDto accountApplicationSetting() throws Exception {
        AccountApplicationSettingQueryRequest request = new AccountApplicationSettingQueryRequest();
        AccountApplicationSettingResponseProjection projection = new AccountApplicationSettingResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        AccountApplicationSettingQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, AccountApplicationSettingQueryResponse.class);
        return result.accountApplicationSetting();
    }

}