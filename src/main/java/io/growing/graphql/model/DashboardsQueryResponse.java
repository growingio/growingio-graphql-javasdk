package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DashboardsQueryResponse extends GraphQLResult<Map<String, java.util.List<DashboardDto>>> {

    private static final String OPERATION_NAME = "dashboards";

    public DashboardsQueryResponse() {
    }

    public java.util.List<DashboardDto> dashboards() {
        Map<String, java.util.List<DashboardDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
