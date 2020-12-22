package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 数据中心的用户变量数量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class DataCenterCountUserVariablesQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "dataCenterCountUserVariables";

    private Map<String, Object> input = new LinkedHashMap<>();

    public DataCenterCountUserVariablesQueryRequest() {
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static class Builder {


        public Builder() {
        }


        public DataCenterCountUserVariablesQueryRequest build() {
            DataCenterCountUserVariablesQueryRequest obj = new DataCenterCountUserVariablesQueryRequest();
            return obj;
        }

    }
}
