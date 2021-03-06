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
public class CreateFrequencyAnalysisMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "createFrequencyAnalysis";

    private Map<String, Object> input = new LinkedHashMap<>();

    public CreateFrequencyAnalysisMutationRequest() {
    }

    public void setProjectId(String projectId) {
        this.input.put("projectId", projectId);
    }

    public void setFrequencyAnalysis(FrequencyAnalysisInputDto frequencyAnalysis) {
        this.input.put("frequencyAnalysis", frequencyAnalysis);
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
        private FrequencyAnalysisInputDto frequencyAnalysis;

        public Builder() {
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setFrequencyAnalysis(FrequencyAnalysisInputDto frequencyAnalysis) {
            this.frequencyAnalysis = frequencyAnalysis;
            return this;
        }


        public CreateFrequencyAnalysisMutationRequest build() {
            CreateFrequencyAnalysisMutationRequest obj = new CreateFrequencyAnalysisMutationRequest();
            obj.setProjectId(projectId);
            obj.setFrequencyAnalysis(frequencyAnalysis);
            return obj;
        }

    }
}
