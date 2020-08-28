package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class ActiveUsersQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "activeUsers";

    private Map<String, Object> input = new LinkedHashMap<>();

    public ActiveUsersQueryRequest() {
    }

    public void setTimeRange(String timeRange) {
        this.input.put("timeRange", timeRange);
    }

    public void setOffset(Integer offset) {
        this.input.put("offset", offset);
    }

    public void setLimit(Integer limit) {
        this.input.put("limit", limit);
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

        private String timeRange;
        private Integer offset;
        private Integer limit;

        public Builder() {
        }

        public Builder setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public Builder setOffset(Integer offset) {
            this.offset = offset;
            return this;
        }

        public Builder setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }


        public ActiveUsersQueryRequest build() {
            ActiveUsersQueryRequest obj = new ActiveUsersQueryRequest();
            obj.setTimeRange(timeRange);
            obj.setOffset(offset);
            obj.setLimit(limit);
            return obj;
        }

    }
}
