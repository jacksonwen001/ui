package com.automation.ui.controllers;

import com.automation.ui.dto.scenario.CreateScenarioRequest;
import com.automation.ui.dto.scenario.QueryScenarioRequest;
import com.automation.ui.dto.scenario.QueryScenarioResponse;
import com.automation.ui.dto.scenario.UpdateScenarioRequest;
import com.automation.ui.service.ScenarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scenarios")
public class ScenarioController {
    @Autowired
    ScenarioService service;

    @GetMapping("")
    public QueryScenarioResponse query(@Validated QueryScenarioRequest request, Pageable pageable) {
        return service.query(request, pageable);
    }

    @PostMapping("")
    public void create(CreateScenarioRequest request) {
        service.create(request);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id, UpdateScenarioRequest request) {
        service.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") Long id) {
        service.remove(id);
    }
}
