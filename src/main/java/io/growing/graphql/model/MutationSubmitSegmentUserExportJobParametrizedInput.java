package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field submitSegmentUserExportJob in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class MutationSubmitSegmentUserExportJobParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String segmentId;
    @javax.validation.constraints.NotNull
    private java.util.List<String> tags;
    @javax.validation.constraints.NotNull
    private java.util.List<String> properties;
    private String charset;

    public MutationSubmitSegmentUserExportJobParametrizedInput() {
    }

    public MutationSubmitSegmentUserExportJobParametrizedInput(String segmentId, java.util.List<String> tags, java.util.List<String> properties, String charset) {
        this.segmentId = segmentId;
        this.tags = tags;
        this.properties = properties;
        this.charset = charset;
    }

    public MutationSubmitSegmentUserExportJobParametrizedInput segmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    public MutationSubmitSegmentUserExportJobParametrizedInput tags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }

    public MutationSubmitSegmentUserExportJobParametrizedInput properties(java.util.List<String> properties) {
        this.properties = properties;
        return this;
    }

    public MutationSubmitSegmentUserExportJobParametrizedInput charset(String charset) {
        this.charset = charset;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (segmentId != null) {
            joiner.add("segmentId: " + GraphQLRequestSerializer.getEntry(segmentId));
        }
        if (tags != null) {
            joiner.add("tags: " + GraphQLRequestSerializer.getEntry(tags));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        if (charset != null) {
            joiner.add("charset: " + GraphQLRequestSerializer.getEntry(charset));
        }
        return joiner.toString();
    }

}
