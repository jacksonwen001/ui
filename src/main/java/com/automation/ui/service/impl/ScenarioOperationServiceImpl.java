package com.automation.ui.service.impl;

import com.automation.ui.dto.scenario.operation.CreateScenarioOperationRequest;
import com.automation.ui.dto.scenario.operation.QueryScenarioOperationRequest;
import com.automation.ui.dto.scenario.operation.QueryScenarioOperationResponse;
import com.automation.ui.dto.scenario.operation.UpdateScenarioOperationRequest;
import com.automation.ui.service.ScenarioOperationService;
import org.springframework.stereotype.Service;

@Service
public class ScenarioOperationServiceImpl implements ScenarioOperationService {
    @Override
    public QueryScenarioOperationResponse query(QueryScenarioOperationRequest request) {
        return null;
    }

    @Override
    public void create(CreateScenarioOperationRequest request) {

    }

    @Override
    public void update(String id, UpdateScenarioOperationRequest request) {

    }

    @Override
    public void remove(String id) {

    }
}
