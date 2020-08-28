package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field ubaUserVariables in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:30+0800"
)
public class QueryUbaUserVariablesParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String tunnelId;

    public QueryUbaUserVariablesParametrizedInput() {
    }

    public QueryUbaUserVariablesParametrizedInput(String tunnelId) {
        this.tunnelId = tunnelId;
    }

    public QueryUbaUserVariablesParametrizedInput tunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (tunnelId != null) {
            joiner.add("tunnelId: " + GraphQLRequestSerializer.getEntry(tunnelId));
        }
        return joiner.toString();
    }

}
