package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface BatchDeleteKpiAnalysesMutationResolver {

    Boolean batchDeleteKpiAnalyses(String projectId, java.util.List<String> ids) throws Exception;

}