package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field dataCenterAcls in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class QueryDataCenterAclsParametrizedInput implements GraphQLParametrizedInput {

    private String resourceType;

    public QueryDataCenterAclsParametrizedInput() {
    }

    public QueryDataCenterAclsParametrizedInput(String resourceType) {
        this.resourceType = resourceType;
    }

    public QueryDataCenterAclsParametrizedInput resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (resourceType != null) {
            joiner.add("resourceType: " + GraphQLRequestSerializer.getEntry(resourceType));
        }
        return joiner.toString();
    }

}
