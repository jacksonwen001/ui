package com.automation.ui.dto.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProjectUpdateRequest {
    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;
}
