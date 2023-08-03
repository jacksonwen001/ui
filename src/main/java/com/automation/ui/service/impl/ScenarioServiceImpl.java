package com.automation.ui.service.impl;

import com.automation.ui.dto.scenario.CreateScenarioRequest;
import com.automation.ui.dto.scenario.QueryScenarioRequest;
import com.automation.ui.dto.scenario.QueryScenarioResponse;
import com.automation.ui.dto.scenario.ScenarioResponse;
import com.automation.ui.dto.scenario.UpdateScenarioRequest;
import com.automation.ui.models.Project;
import com.automation.ui.models.Scenario;
import com.automation.ui.repository.ScenarioRepository;
import com.automation.ui.service.ScenarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ScenarioServiceImpl implements ScenarioService {
    @Autowired
    ScenarioRepository repository;
    @Override
    public QueryScenarioResponse query(QueryScenarioRequest request, Pageable pageable) {
        Specification<Scenario> specification = (root, query, criteriaBuilder) -> {
            Optional<String> name = Optional.ofNullable(request.getName());
            if (name.isPresent()) {
                return criteriaBuilder.like(criteriaBuilder.lower(root.get("name")), "%" + name.get().toLowerCase() + "%");
            }
            return criteriaBuilder.conjunction();
        };
        Page<Scenario> scenarios = repository.findAllByCreatedAtDesc(specification, pageable);
        QueryScenarioResponse response = new QueryScenarioResponse();
        response.scenarios = scenarios.stream().map(scenario -> {
            ScenarioResponse scenarioResponse = new ScenarioResponse();
            return scenarioResponse;
        }).toList();
        return response;
    }

    @Override
    public void create(CreateScenarioRequest request) {

    }

    @Override
    public void update(Long id, UpdateScenarioRequest request) {

    }

    @Override
    public void remove(Long id) {

    }
}
