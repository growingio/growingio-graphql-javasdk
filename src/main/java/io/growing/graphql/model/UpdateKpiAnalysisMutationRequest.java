package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class UpdateKpiAnalysisMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "updateKpiAnalysis";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UpdateKpiAnalysisMutationRequest() {
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setKpiAnalysis(KpiAnalysisInputDto kpiAnalysis) {
        this.input.put("kpiAnalysis", kpiAnalysis);
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
        private KpiAnalysisInputDto kpiAnalysis;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setKpiAnalysis(KpiAnalysisInputDto kpiAnalysis) {
            this.kpiAnalysis = kpiAnalysis;
            return this;
        }


        public UpdateKpiAnalysisMutationRequest build() {
            UpdateKpiAnalysisMutationRequest obj = new UpdateKpiAnalysisMutationRequest();
            obj.setId(id);
            obj.setKpiAnalysis(kpiAnalysis);
            return obj;
        }

    }
}
