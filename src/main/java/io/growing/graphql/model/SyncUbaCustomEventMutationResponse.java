package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class SyncUbaCustomEventMutationResponse extends GraphQLResult<Map<String, java.util.List<CustomEventDto>>> {

    private static final String OPERATION_NAME = "syncUbaCustomEvent";

    public SyncUbaCustomEventMutationResponse() {
    }

    public java.util.List<CustomEventDto> syncUbaCustomEvent() {
        Map<String, java.util.List<CustomEventDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
