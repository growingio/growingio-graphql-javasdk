package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for LogEntry
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class LogEntryResponseProjection extends GraphQLResponseProjection {

    public LogEntryResponseProjection() {
    }

    public LogEntryResponseProjection operation() {
        return operation(null);
    }

    public LogEntryResponseProjection operation(String alias) {
        fields.add(new GraphQLResponseField("operation").alias(alias));
        return this;
    }

    public LogEntryResponseProjection message() {
        return message(null);
    }

    public LogEntryResponseProjection message(String alias) {
        fields.add(new GraphQLResponseField("message").alias(alias));
        return this;
    }

    public LogEntryResponseProjection operatorId() {
        return operatorId(null);
    }

    public LogEntryResponseProjection operatorId(String alias) {
        fields.add(new GraphQLResponseField("operatorId").alias(alias));
        return this;
    }

    public LogEntryResponseProjection timestamp() {
        return timestamp(null);
    }

    public LogEntryResponseProjection timestamp(String alias) {
        fields.add(new GraphQLResponseField("timestamp").alias(alias));
        return this;
    }

    public LogEntryResponseProjection operator() {
        return operator(null);
    }

    public LogEntryResponseProjection operator(String alias) {
        fields.add(new GraphQLResponseField("operator").alias(alias));
        return this;
    }

    public LogEntryResponseProjection typename() {
        return typename(null);
    }

    public LogEntryResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
