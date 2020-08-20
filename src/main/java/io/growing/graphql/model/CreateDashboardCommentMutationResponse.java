package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class CreateDashboardCommentMutationResponse extends GraphQLResult<Map<String, DashboardCommentDto>> {

    private static final String OPERATION_NAME = "createDashboardComment";

    public CreateDashboardCommentMutationResponse() {
    }

    public DashboardCommentDto createDashboardComment() {
        Map<String, DashboardCommentDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
