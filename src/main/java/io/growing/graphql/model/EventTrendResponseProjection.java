package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for EventTrend
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class EventTrendResponseProjection extends GraphQLResponseProjection {

    public EventTrendResponseProjection() {
    }

    public EventTrendResponseProjection interval() {
        return interval(null);
    }

    public EventTrendResponseProjection interval(String alias) {
        fields.add(new GraphQLResponseField("interval").alias(alias));
        return this;
    }

    public EventTrendResponseProjection points(TrendPointResponseProjection subProjection) {
        return points(null, subProjection);
    }

    public EventTrendResponseProjection points(String alias, TrendPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("points").alias(alias).projection(subProjection));
        return this;
    }

    public EventTrendResponseProjection typename() {
        return typename(null);
    }

    public EventTrendResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
