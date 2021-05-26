package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 数据中心 创建事件变量
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class CreateDataCenterEventVariableMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "createDataCenterEventVariable";

    private Map<String, Object> input = new LinkedHashMap<>();

    public CreateDataCenterEventVariableMutationRequest() {
    }

    public void setEventVariable(VariableInputDto eventVariable) {
        this.input.put("eventVariable", eventVariable);
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

        private VariableInputDto eventVariable;

        public Builder() {
        }

        public Builder setEventVariable(VariableInputDto eventVariable) {
            this.eventVariable = eventVariable;
            return this;
        }


        public CreateDataCenterEventVariableMutationRequest build() {
            CreateDataCenterEventVariableMutationRequest obj = new CreateDataCenterEventVariableMutationRequest();
            obj.setEventVariable(eventVariable);
            return obj;
        }

    }
}
