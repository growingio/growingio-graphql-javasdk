package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface TransferDataCenterOwnerMutationResolver {

    @javax.validation.constraints.NotNull
    Boolean transferDataCenterOwner(String transfereeId) throws Exception;

}