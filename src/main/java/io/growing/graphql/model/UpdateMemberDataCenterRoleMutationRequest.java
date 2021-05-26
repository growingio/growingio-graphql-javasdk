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
public class UpdateMemberDataCenterRoleMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "updateMemberDataCenterRole";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UpdateMemberDataCenterRoleMutationRequest() {
    }

    public void setMemberId(String memberId) {
        this.input.put("memberId", memberId);
    }

    public void setRoleId(String roleId) {
        this.input.put("roleId", roleId);
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

        private String memberId;
        private String roleId;

        public Builder() {
        }

        public Builder setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }

        public Builder setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }


        public UpdateMemberDataCenterRoleMutationRequest build() {
            UpdateMemberDataCenterRoleMutationRequest obj = new UpdateMemberDataCenterRoleMutationRequest();
            obj.setMemberId(memberId);
            obj.setRoleId(roleId);
            return obj;
        }

    }
}
