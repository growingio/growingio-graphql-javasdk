package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field crystalBallUserInfoPanels in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class QueryCrystalBallUserInfoPanelsParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;

    public QueryCrystalBallUserInfoPanelsParametrizedInput() {
    }

    public QueryCrystalBallUserInfoPanelsParametrizedInput(String projectId) {
        this.projectId = projectId;
    }

    public QueryCrystalBallUserInfoPanelsParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        return joiner.toString();
    }

}
