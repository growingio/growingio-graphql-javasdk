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
public class UbaCustomEventsQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "ubaCustomEvents";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UbaCustomEventsQueryRequest() {
    }

    public void setTunnelId(String tunnelId) {
        this.input.put("tunnelId", tunnelId);
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

        private String tunnelId;

        public Builder() {
        }

        public Builder setTunnelId(String tunnelId) {
            this.tunnelId = tunnelId;
            return this;
        }


        public UbaCustomEventsQueryRequest build() {
            UbaCustomEventsQueryRequest obj = new UbaCustomEventsQueryRequest();
            obj.setTunnelId(tunnelId);
            return obj;
        }

    }
}
