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
public class UpdateProjectDataCtrlMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "updateProjectDataCtrl";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UpdateProjectDataCtrlMutationRequest() {
    }

    public void setInput(UpdateProjectDataCtrlInputDto input) {
        this.input.put("input", input);
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

        private UpdateProjectDataCtrlInputDto input;

        public Builder() {
        }

        public Builder setInput(UpdateProjectDataCtrlInputDto input) {
            this.input = input;
            return this;
        }


        public UpdateProjectDataCtrlMutationRequest build() {
            UpdateProjectDataCtrlMutationRequest obj = new UpdateProjectDataCtrlMutationRequest();
            obj.setInput(input);
            return obj;
        }

    }
}
