package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * activeToday: 今日活跃用户
 * activeInThreeWeeks: 近 3 周活跃用户
 * activeNotInTwoWeeks: 近 2 周不活跃用户
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public interface PreparedSegmentQueryResolver {

    /**
     * activeToday: 今日活跃用户
     * activeInThreeWeeks: 近 3 周活跃用户
     * activeNotInTwoWeeks: 近 2 周不活跃用户
     */
    PreparedSegmentDto preparedSegment(String id) throws Exception;

}