package com.automation.ui.service.impl;

import com.automation.ui.dto.scenario.component.CreateScenarioComponentRequest;
import com.automation.ui.dto.scenario.component.QueryScenarioComponentRequest;
import com.automation.ui.dto.scenario.component.QueryScenarioComponentResponse;
import com.automation.ui.dto.scenario.component.UpdateScenarioComponentRequest;
import com.automation.ui.service.ScenarioComponentService;
import org.springframework.stereotype.Service;

@Service
public class ScenarioComponentServiceImpl implements ScenarioComponentService {
    @Override
    public QueryScenarioComponentResponse query(QueryScenarioComponentRequest request) {
        return null;
    }

    @Override
    public void create(CreateScenarioComponentRequest request) {

    }

    @Override
    public void update(String id, UpdateScenarioComponentRequest request) {

    }

    @Override
    public void remove(String id) {

    }
}
