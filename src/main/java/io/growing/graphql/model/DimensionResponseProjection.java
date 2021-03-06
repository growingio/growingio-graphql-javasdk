package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Dimension
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class DimensionResponseProjection extends GraphQLResponseProjection {

    public DimensionResponseProjection() {
    }

    @Override
    public DimensionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DimensionResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.type();
        this.groupId();
        this.groupName();
        this.valueType();
        this.typename();
        return this;
    }

    public DimensionResponseProjection id() {
        return id(null);
    }

    public DimensionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public DimensionResponseProjection name() {
        return name(null);
    }

    public DimensionResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public DimensionResponseProjection type() {
        return type(null);
    }

    public DimensionResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public DimensionResponseProjection groupId() {
        return groupId(null);
    }

    public DimensionResponseProjection groupId(String alias) {
        fields.add(new GraphQLResponseField("groupId").alias(alias));
        return this;
    }

    public DimensionResponseProjection groupName() {
        return groupName(null);
    }

    public DimensionResponseProjection groupName(String alias) {
        fields.add(new GraphQLResponseField("groupName").alias(alias));
        return this;
    }

    public DimensionResponseProjection valueType() {
        return valueType(null);
    }

    public DimensionResponseProjection valueType(String alias) {
        fields.add(new GraphQLResponseField("valueType").alias(alias));
        return this;
    }

    public DimensionResponseProjection typename() {
        return typename(null);
    }

    public DimensionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
