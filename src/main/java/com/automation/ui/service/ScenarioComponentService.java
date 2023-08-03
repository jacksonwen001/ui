package com.automation.ui.service;

import com.automation.ui.dto.scenario.component.CreateScenarioComponentRequest;
import com.automation.ui.dto.scenario.component.QueryScenarioComponentRequest;
import com.automation.ui.dto.scenario.component.QueryScenarioComponentResponse;
import com.automation.ui.dto.scenario.component.UpdateScenarioComponentRequest;

public interface ScenarioComponentService {
    QueryScenarioComponentResponse query(QueryScenarioComponentRequest request);
    void create(CreateScenarioComponentRequest request);
    void update(String id, UpdateScenarioComponentRequest request);
    void remove(String id);
}
