package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public interface DeleteEventAnalysisMutationResolver {

    @javax.validation.constraints.NotNull
    Boolean deleteEventAnalysis(String id) throws Exception;

}