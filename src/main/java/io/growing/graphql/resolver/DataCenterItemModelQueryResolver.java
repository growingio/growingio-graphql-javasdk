package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 通过 id 获取数据中心的物品模型
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface DataCenterItemModelQueryResolver {

    /**
     * 通过 id 获取数据中心的物品模型
     */
    ItemModelDto dataCenterItemModel(String id) throws Exception;

}