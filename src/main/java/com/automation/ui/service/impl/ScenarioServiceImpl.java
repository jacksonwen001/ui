package com.automation.ui.service.impl;

import com.automation.ui.dto.scenario.CreateScenarioRequest;
import com.automation.ui.dto.scenario.QueryScenarioRequest;
import com.automation.ui.dto.scenario.QueryScenarioResponse;
import com.automation.ui.dto.scenario.UpdateScenarioRequest;
import com.automation.ui.service.ScenarioService;
import org.springframework.stereotype.Service;

@Service
public class ScenarioServiceImpl implements ScenarioService {
    @Override
    public QueryScenarioResponse query(QueryScenarioRequest request) {
        return null;
    }

    @Override
    public void create(CreateScenarioRequest request) {

    }

    @Override
    public void update(String id, UpdateScenarioRequest request) {

    }

    @Override
    public void remove(String id) {

    }
}
