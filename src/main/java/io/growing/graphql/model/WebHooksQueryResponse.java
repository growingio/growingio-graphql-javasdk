package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class WebHooksQueryResponse extends GraphQLResult<Map<String, java.util.List<WebHookDto>>> {

    private static final String OPERATION_NAME = "webHooks";

    public WebHooksQueryResponse() {
    }

    public java.util.List<WebHookDto> webHooks() {
        Map<String, java.util.List<WebHookDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
