package com.automation.ui.service;

import com.automation.ui.dto.scenario.CreateScenarioRequest;
import com.automation.ui.dto.scenario.QueryScenarioRequest;
import com.automation.ui.dto.scenario.QueryScenarioResponse;
import com.automation.ui.dto.scenario.UpdateScenarioRequest;
import org.springframework.data.domain.Pageable;

public interface ScenarioService {
    QueryScenarioResponse query(QueryScenarioRequest request, Pageable pageable);
    void create(CreateScenarioRequest request);
    void update(Long id, UpdateScenarioRequest request);
    void remove(Long id);
}
