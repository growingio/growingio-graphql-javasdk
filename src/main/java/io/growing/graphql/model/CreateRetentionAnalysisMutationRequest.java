package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class CreateRetentionAnalysisMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "createRetentionAnalysis";

    private Map<String, Object> input = new LinkedHashMap<>();

    public CreateRetentionAnalysisMutationRequest() {
    }

    public void setProjectId(String projectId) {
        this.input.put("projectId", projectId);
    }

    public void setRetentionAnalysis(RetentionAnalysisInputDto retentionAnalysis) {
        this.input.put("retentionAnalysis", retentionAnalysis);
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
        private RetentionAnalysisInputDto retentionAnalysis;

        public Builder() {
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setRetentionAnalysis(RetentionAnalysisInputDto retentionAnalysis) {
            this.retentionAnalysis = retentionAnalysis;
            return this;
        }


        public CreateRetentionAnalysisMutationRequest build() {
            CreateRetentionAnalysisMutationRequest obj = new CreateRetentionAnalysisMutationRequest();
            obj.setProjectId(projectId);
            obj.setRetentionAnalysis(retentionAnalysis);
            return obj;
        }

    }
}
