package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class RetentionAnalysesQueryResponse extends GraphQLResult<Map<String, java.util.List<RetentionAnalysisDto>>> {

    private static final String OPERATION_NAME = "retentionAnalyses";

    public RetentionAnalysesQueryResponse() {
    }

    public java.util.List<RetentionAnalysisDto> retentionAnalyses() {
        Map<String, java.util.List<RetentionAnalysisDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
