package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field deleteFunnelAnalysis in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MutationDeleteFunnelAnalysisParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String id;

    public MutationDeleteFunnelAnalysisParametrizedInput() {
    }

    public MutationDeleteFunnelAnalysisParametrizedInput(String projectId, String id) {
        this.projectId = projectId;
        this.id = id;
    }

    public MutationDeleteFunnelAnalysisParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public MutationDeleteFunnelAnalysisParametrizedInput id(String id) {
        this.id = id;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        return joiner.toString();
    }

}
