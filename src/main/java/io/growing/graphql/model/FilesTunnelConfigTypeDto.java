package io.growing.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public enum FilesTunnelConfigTypeDto {

    HISTORY_EVENT("HISTORY_EVENT"),
    USER_PROPERTY("USER_PROPERTY"),
    ITEM_PROPERTY("ITEM_PROPERTY");

    private final String graphqlName;

    private FilesTunnelConfigTypeDto(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}