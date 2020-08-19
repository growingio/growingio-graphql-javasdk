package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for AccessEntry
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class AccessEntryResponseProjection extends GraphQLResponseProjection {

    public AccessEntryResponseProjection() {
    }

    public AccessEntryResponseProjection isPublic() {
        return isPublic(null);
    }

    public AccessEntryResponseProjection isPublic(String alias) {
        fields.add(new GraphQLResponseField("isPublic").alias(alias));
        return this;
    }

    public AccessEntryResponseProjection members() {
        return members(null);
    }

    public AccessEntryResponseProjection members(String alias) {
        fields.add(new GraphQLResponseField("members").alias(alias));
        return this;
    }

    public AccessEntryResponseProjection groups(GroupResponseProjection subProjection) {
        return groups(null, subProjection);
    }

    public AccessEntryResponseProjection groups(String alias, GroupResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("groups").alias(alias).projection(subProjection));
        return this;
    }

    public AccessEntryResponseProjection actions() {
        return actions(null);
    }

    public AccessEntryResponseProjection actions(String alias) {
        fields.add(new GraphQLResponseField("actions").alias(alias));
        return this;
    }

    public AccessEntryResponseProjection typename() {
        return typename(null);
    }

    public AccessEntryResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
