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
public class UserProjectPermissionModulesQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "userProjectPermissionModules";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UserProjectPermissionModulesQueryRequest() {
    }

    public void setProjectId(String projectId) {
        this.input.put("projectId", projectId);
    }

    public void setUserId(String userId) {
        this.input.put("userId", userId);
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
        private String userId;

        public Builder() {
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }


        public UserProjectPermissionModulesQueryRequest build() {
            UserProjectPermissionModulesQueryRequest obj = new UserProjectPermissionModulesQueryRequest();
            obj.setProjectId(projectId);
            obj.setUserId(userId);
            return obj;
        }

    }
}
