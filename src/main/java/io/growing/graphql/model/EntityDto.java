package io.growing.graphql.model;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,property = "__typename")
@com.fasterxml.jackson.annotation.JsonSubTypes(value = {
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = SegmentDto.class, name = "Segment"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = UserSummaryDto.class, name = "UserSummary"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = TagDto.class, name = "Tag"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = TunnelDto.class, name = "Tunnel"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = UserEventDto.class, name = "UserEvent")
        })
public interface EntityDto {

}