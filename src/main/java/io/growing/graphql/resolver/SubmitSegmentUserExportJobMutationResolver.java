package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public interface SubmitSegmentUserExportJobMutationResolver {

    @javax.validation.constraints.NotNull
    SegmentUserExportJobDto submitSegmentUserExportJob(String segmentId, java.util.List<String> tags, java.util.List<String> properties, String charset) throws Exception;

}