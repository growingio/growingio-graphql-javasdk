package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 通过 id 获取数据中心标签
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public interface DataCenterTagQueryResolver {

    /**
     * 通过 id 获取数据中心标签
     */
    TagDto dataCenterTag(String id) throws Exception;

}