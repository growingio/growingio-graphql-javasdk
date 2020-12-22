package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class CrystalBallDashboardsQueryResponse extends GraphQLResult<Map<String, java.util.List<DashboardDto>>> {

    private static final String OPERATION_NAME = "crystalBallDashboards";

    public CrystalBallDashboardsQueryResponse() {
    }

    public java.util.List<DashboardDto> crystalBallDashboards() {
        Map<String, java.util.List<DashboardDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
