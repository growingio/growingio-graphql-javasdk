package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface CreateDataCenterTagMutationResolver {

    @javax.validation.constraints.NotNull
    TagDto createDataCenterTag(TagInputDto tag) throws Exception;

}