package com.automation.ui.service;

import com.automation.ui.dto.scenario.page.CreateScenarioPageRequest;
import com.automation.ui.dto.scenario.page.QueryScenarioPageRequest;
import com.automation.ui.dto.scenario.page.QueryScenarioPageResponse;
import com.automation.ui.dto.scenario.page.UpdateScenarioPageRequest;

public interface ScenarioPageService {
    QueryScenarioPageResponse query(QueryScenarioPageRequest request);
    void create(CreateScenarioPageRequest request);
    void update(String id, UpdateScenarioPageRequest request);
    void remove(String id);
}
