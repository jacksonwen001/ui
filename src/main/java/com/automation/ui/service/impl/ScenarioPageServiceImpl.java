package com.automation.ui.service.impl;

import com.automation.ui.dto.scenario.page.CreateScenarioPageRequest;
import com.automation.ui.dto.scenario.page.QueryScenarioPageRequest;
import com.automation.ui.dto.scenario.page.QueryScenarioPageResponse;
import com.automation.ui.dto.scenario.page.UpdateScenarioPageRequest;
import com.automation.ui.service.ScenarioPageService;
import org.springframework.stereotype.Service;

@Service
public class ScenarioPageServiceImpl implements ScenarioPageService {
    @Override
    public QueryScenarioPageResponse query(QueryScenarioPageRequest request) {
        return null;
    }

    @Override
    public void create(CreateScenarioPageRequest request) {

    }

    @Override
    public void update(String id, UpdateScenarioPageRequest request) {

    }

    @Override
    public void remove(String id) {

    }
}
