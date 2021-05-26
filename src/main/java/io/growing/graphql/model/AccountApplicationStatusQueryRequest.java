package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AccountApplicationStatusQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "accountApplicationStatus";

    private Map<String, Object> input = new LinkedHashMap<>();

    public AccountApplicationStatusQueryRequest() {
    }

    public void setIdentity(String identity) {
        this.input.put("identity", identity);
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

        private String identity;

        public Builder() {
        }

        public Builder setIdentity(String identity) {
            this.identity = identity;
            return this;
        }


        public AccountApplicationStatusQueryRequest build() {
            AccountApplicationStatusQueryRequest obj = new AccountApplicationStatusQueryRequest();
            obj.setIdentity(identity);
            return obj;
        }

    }
}
