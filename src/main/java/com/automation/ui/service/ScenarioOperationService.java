package com.automation.ui.service;

import com.automation.ui.dto.scenario.operation.CreateScenarioOperationRequest;
import com.automation.ui.dto.scenario.operation.QueryScenarioOperationRequest;
import com.automation.ui.dto.scenario.operation.QueryScenarioOperationResponse;
import com.automation.ui.dto.scenario.operation.UpdateScenarioOperationRequest;

public interface ScenarioOperationService {
    QueryScenarioOperationResponse query(QueryScenarioOperationRequest request);
    void create(CreateScenarioOperationRequest request);
    void update(String id, UpdateScenarioOperationRequest request);
    void remove(String id);
}
