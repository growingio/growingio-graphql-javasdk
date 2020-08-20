package io.growing.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public enum UserEventTypeDto {

    ALL("ALL"),
    VISIT("VISIT"),
    CUSTOM_EVENT("CUSTOM_EVENT"),
    PAGE("PAGE"),
    UNKNOWN("UNKNOWN");

    private final String graphqlName;

    private UserEventTypeDto(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}