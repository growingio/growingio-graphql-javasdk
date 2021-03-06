package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Tunnel
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class TunnelResponseProjection extends GraphQLResponseProjection {

    public TunnelResponseProjection() {
    }

    @Override
    public TunnelResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TunnelResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.type();
        if (projectionDepthOnFields.getOrDefault("TunnelResponseProjection.TunnelConfigResponseProjection.config", 0) <= maxDepth) {
            projectionDepthOnFields.put("TunnelResponseProjection.TunnelConfigResponseProjection.config", projectionDepthOnFields.getOrDefault("TunnelResponseProjection.TunnelConfigResponseProjection.config", 0) + 1);
            this.config(new TunnelConfigResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TunnelResponseProjection.TunnelConfigResponseProjection.config", 0)));
        }
        this.description();
        this.key();
        this.projectKey();
        this.creatorId();
        this.createdAt();
        this.updaterId();
        this.updatedAt();
        this.creator();
        this.updater();
        this.ownerId();
        this.typename();
        return this;
    }

    public TunnelResponseProjection id() {
        return id(null);
    }

    public TunnelResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public TunnelResponseProjection name() {
        return name(null);
    }

    public TunnelResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public TunnelResponseProjection type() {
        return type(null);
    }

    public TunnelResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public TunnelResponseProjection config(TunnelConfigResponseProjection subProjection) {
        return config(null, subProjection);
    }

    public TunnelResponseProjection config(String alias, TunnelConfigResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("config").alias(alias).projection(subProjection));
        return this;
    }

    public TunnelResponseProjection description() {
        return description(null);
    }

    public TunnelResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public TunnelResponseProjection key() {
        return key(null);
    }

    public TunnelResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public TunnelResponseProjection projectKey() {
        return projectKey(null);
    }

    public TunnelResponseProjection projectKey(String alias) {
        fields.add(new GraphQLResponseField("projectKey").alias(alias));
        return this;
    }

    public TunnelResponseProjection creatorId() {
        return creatorId(null);
    }

    public TunnelResponseProjection creatorId(String alias) {
        fields.add(new GraphQLResponseField("creatorId").alias(alias));
        return this;
    }

    public TunnelResponseProjection createdAt() {
        return createdAt(null);
    }

    public TunnelResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public TunnelResponseProjection updaterId() {
        return updaterId(null);
    }

    public TunnelResponseProjection updaterId(String alias) {
        fields.add(new GraphQLResponseField("updaterId").alias(alias));
        return this;
    }

    public TunnelResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public TunnelResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public TunnelResponseProjection creator() {
        return creator(null);
    }

    public TunnelResponseProjection creator(String alias) {
        fields.add(new GraphQLResponseField("creator").alias(alias));
        return this;
    }

    public TunnelResponseProjection updater() {
        return updater(null);
    }

    public TunnelResponseProjection updater(String alias) {
        fields.add(new GraphQLResponseField("updater").alias(alias));
        return this;
    }

    public TunnelResponseProjection ownerId() {
        return ownerId(null);
    }

    public TunnelResponseProjection ownerId(String alias) {
        fields.add(new GraphQLResponseField("ownerId").alias(alias));
        return this;
    }

    public TunnelResponseProjection typename() {
        return typename(null);
    }

    public TunnelResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
