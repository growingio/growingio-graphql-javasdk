package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field funnelAnalysis in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:30+0800"
)
public class QueryFunnelAnalysisParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String id;
    private String dashboardId;

    public QueryFunnelAnalysisParametrizedInput() {
    }

    public QueryFunnelAnalysisParametrizedInput(String id, String dashboardId) {
        this.id = id;
        this.dashboardId = dashboardId;
    }

    public QueryFunnelAnalysisParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public QueryFunnelAnalysisParametrizedInput dashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (dashboardId != null) {
            joiner.add("dashboardId: " + GraphQLRequestSerializer.getEntry(dashboardId));
        }
        return joiner.toString();
    }

}
