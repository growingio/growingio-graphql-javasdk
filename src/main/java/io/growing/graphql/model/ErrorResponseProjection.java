package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Error
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class ErrorResponseProjection extends GraphQLResponseProjection {

    public ErrorResponseProjection() {
    }

    public ErrorResponseProjection code() {
        return code(null);
    }

    public ErrorResponseProjection code(String alias) {
        fields.add(new GraphQLResponseField("code").alias(alias));
        return this;
    }

    public ErrorResponseProjection message() {
        return message(null);
    }

    public ErrorResponseProjection message(String alias) {
        fields.add(new GraphQLResponseField("message").alias(alias));
        return this;
    }

    public ErrorResponseProjection typename() {
        return typename(null);
    }

    public ErrorResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
