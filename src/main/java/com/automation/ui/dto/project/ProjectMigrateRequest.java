package com.automation.ui.dto.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;

public class ProjectMigrateRequest {
    @NotBlank
    @JsonProperty("projectId")
    private String projectId;

    @NotBlank
    @JsonProperty("from")
    private String from;

    @NotBlank
    @JsonProperty("to")
    private String to;
}
