package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 获取二维码长链
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class MinpCircleQrcodeQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "minpCircleQrcode";

    private Map<String, Object> input = new LinkedHashMap<>();

    public MinpCircleQrcodeQueryRequest() {
    }

    public void setProductId(String productId) {
        this.input.put("productId", productId);
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

        private String productId;

        public Builder() {
        }

        public Builder setProductId(String productId) {
            this.productId = productId;
            return this;
        }


        public MinpCircleQrcodeQueryRequest build() {
            MinpCircleQrcodeQueryRequest obj = new MinpCircleQrcodeQueryRequest();
            obj.setProductId(productId);
            return obj;
        }

    }
}
