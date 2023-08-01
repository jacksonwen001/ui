package com.automation.ui.service;

import com.automation.ui.dto.scenario.CreateScenarioRequest;
import com.automation.ui.dto.scenario.QueryScenarioRequest;
import com.automation.ui.dto.scenario.QueryScenarioResponse;
import com.automation.ui.dto.scenario.UpdateScenarioRequest;

public interface ScenarioService {
    QueryScenarioResponse query(QueryScenarioRequest request);
    void create(CreateScenarioRequest request);
    void update(String id, UpdateScenarioRequest request);
    void remove(String id);
}
