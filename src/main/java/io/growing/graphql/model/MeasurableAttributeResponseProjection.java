package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for MeasurableAttribute
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class MeasurableAttributeResponseProjection extends GraphQLResponseProjection {

    public MeasurableAttributeResponseProjection() {
    }

    public MeasurableAttributeResponseProjection id() {
        return id(null);
    }

    public MeasurableAttributeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public MeasurableAttributeResponseProjection name() {
        return name(null);
    }

    public MeasurableAttributeResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public MeasurableAttributeResponseProjection valueType() {
        return valueType(null);
    }

    public MeasurableAttributeResponseProjection valueType(String alias) {
        fields.add(new GraphQLResponseField("valueType").alias(alias));
        return this;
    }

    public MeasurableAttributeResponseProjection typename() {
        return typename(null);
    }

    public MeasurableAttributeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
