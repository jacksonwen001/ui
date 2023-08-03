package com.automation.ui.dto.scenario;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class QueryScenarioRequest {
    private String name;

    @NotNull
    private Long projectId;

    @NotNull
    private Long env;

}
