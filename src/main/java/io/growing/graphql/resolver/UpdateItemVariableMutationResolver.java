package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public interface UpdateItemVariableMutationResolver {

    @javax.validation.constraints.NotNull
    ItemVariableDto updateItemVariable(String id, VariableInputDto itemVariable) throws Exception;

}