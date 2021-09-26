package ru.bogdan.project.api.v1.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VariableDto {
    @JsonProperty(value = "variable")
    private int variable;

    public VariableDto() {
    }

    public int getVariable() {
        return variable;
    }

    public VariableDto(int variable) {
        this.variable = variable;
    }

    public void setVariable(int variable) {
        this.variable = variable;
    }
}
