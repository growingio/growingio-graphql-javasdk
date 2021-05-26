package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TagsQueryResponse extends GraphQLResult<Map<String, java.util.List<TagDto>>> {

    private static final String OPERATION_NAME = "tags";

    public TagsQueryResponse() {
    }

    public java.util.List<TagDto> tags() {
        Map<String, java.util.List<TagDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
