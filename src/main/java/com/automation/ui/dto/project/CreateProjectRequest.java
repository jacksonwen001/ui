package com.automation.ui.dto.project;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class CreateProjectRequest {
    @NotBlank(message = "project_name must not be null or empty")
    @JsonProperty("project_name")
    private String name;

    @JsonProperty("project_description")
    private String description;
}
