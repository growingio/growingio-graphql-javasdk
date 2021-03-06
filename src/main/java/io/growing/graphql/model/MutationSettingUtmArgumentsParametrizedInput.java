package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field settingUtmArguments in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MutationSettingUtmArgumentsParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private java.util.List<UtmArgumentInputDto> utmArguments;

    public MutationSettingUtmArgumentsParametrizedInput() {
    }

    public MutationSettingUtmArgumentsParametrizedInput(java.util.List<UtmArgumentInputDto> utmArguments) {
        this.utmArguments = utmArguments;
    }

    public MutationSettingUtmArgumentsParametrizedInput utmArguments(java.util.List<UtmArgumentInputDto> utmArguments) {
        this.utmArguments = utmArguments;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (utmArguments != null) {
            joiner.add("utmArguments: " + GraphQLRequestSerializer.getEntry(utmArguments));
        }
        return joiner.toString();
    }

}
