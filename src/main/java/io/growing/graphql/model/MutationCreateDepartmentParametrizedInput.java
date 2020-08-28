package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field createDepartment in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class MutationCreateDepartmentParametrizedInput implements GraphQLParametrizedInput {

    private DepartmentInputDto department;

    public MutationCreateDepartmentParametrizedInput() {
    }

    public MutationCreateDepartmentParametrizedInput(DepartmentInputDto department) {
        this.department = department;
    }

    public MutationCreateDepartmentParametrizedInput department(DepartmentInputDto department) {
        this.department = department;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (department != null) {
            joiner.add("department: " + GraphQLRequestSerializer.getEntry(department));
        }
        return joiner.toString();
    }

}
