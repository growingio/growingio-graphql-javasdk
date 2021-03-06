package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field activeUsers in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class QueryActiveUsersParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String timeRange;
    private Integer offset;
    private Integer limit;

    public QueryActiveUsersParametrizedInput() {
    }

    public QueryActiveUsersParametrizedInput(String projectId, String timeRange, Integer offset, Integer limit) {
        this.projectId = projectId;
        this.timeRange = timeRange;
        this.offset = offset;
        this.limit = limit;
    }

    public QueryActiveUsersParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public QueryActiveUsersParametrizedInput timeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    public QueryActiveUsersParametrizedInput offset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public QueryActiveUsersParametrizedInput limit(Integer limit) {
        this.limit = limit;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (timeRange != null) {
            joiner.add("timeRange: " + GraphQLRequestSerializer.getEntry(timeRange));
        }
        if (offset != null) {
            joiner.add("offset: " + GraphQLRequestSerializer.getEntry(offset));
        }
        if (limit != null) {
            joiner.add("limit: " + GraphQLRequestSerializer.getEntry(limit));
        }
        return joiner.toString();
    }

}
