package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 通过 id 获取数据中心的物品模型变量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public interface DataCenterItemVariableQueryResolver {

    /**
     * 通过 id 获取数据中心的物品模型变量
     */
    ItemVariableDto dataCenterItemVariable(String id) throws Exception;

}