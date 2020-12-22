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
public class SettingPersonaMeasurementsMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "settingPersonaMeasurements";

    private Map<String, Object> input = new LinkedHashMap<>();

    public SettingPersonaMeasurementsMutationRequest() {
    }

    public void setProjectId(String projectId) {
        this.input.put("projectId", projectId);
    }

    public void setMeasurements(java.util.List<MeasurementInputDto> measurements) {
        this.input.put("measurements", measurements);
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

        private String projectId;
        private java.util.List<MeasurementInputDto> measurements;

        public Builder() {
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setMeasurements(java.util.List<MeasurementInputDto> measurements) {
            this.measurements = measurements;
            return this;
        }


        public SettingPersonaMeasurementsMutationRequest build() {
            SettingPersonaMeasurementsMutationRequest obj = new SettingPersonaMeasurementsMutationRequest();
            obj.setProjectId(projectId);
            obj.setMeasurements(measurements);
            return obj;
        }

    }
}
