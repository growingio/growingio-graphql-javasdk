package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class UpdateDataCenterUserVariableMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "updateDataCenterUserVariable";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UpdateDataCenterUserVariableMutationRequest() {
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setUserVariable(VariableInputDto userVariable) {
        this.input.put("userVariable", userVariable);
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

        private String id;
        private VariableInputDto userVariable;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setUserVariable(VariableInputDto userVariable) {
            this.userVariable = userVariable;
            return this;
        }


        public UpdateDataCenterUserVariableMutationRequest build() {
            UpdateDataCenterUserVariableMutationRequest obj = new UpdateDataCenterUserVariableMutationRequest();
            obj.setId(id);
            obj.setUserVariable(userVariable);
            return obj;
        }

    }
}
