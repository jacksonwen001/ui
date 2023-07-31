package com.automation.ui.dto.project;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryProjectsResponse {
    @JsonProperty("total")
    private Long total;

    @JsonProperty("projects")
    private List<ProjectResponse> projects;
}
