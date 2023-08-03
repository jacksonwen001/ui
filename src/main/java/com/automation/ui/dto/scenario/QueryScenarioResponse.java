package com.automation.ui.dto.scenario;

import com.automation.ui.models.Scenario;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class QueryScenarioResponse {
    @NotNull
    @JsonProperty("total")
    private Long total;

    @JsonProperty("scenarios")
    public List<ScenarioResponse> scenarios;

}
