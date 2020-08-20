package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class BatchDeleteItemModelsMutationResponse extends GraphQLResult<Map<String, Boolean>> {

    private static final String OPERATION_NAME = "batchDeleteItemModels";

    public BatchDeleteItemModelsMutationResponse() {
    }

    public Boolean batchDeleteItemModels() {
        Map<String, Boolean> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
