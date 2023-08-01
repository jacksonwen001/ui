package com.automation.ui.controllers;

import com.automation.ui.dto.project.ProjectCreateRequest;
import com.automation.ui.dto.project.ProjectMigrateRequest;
import com.automation.ui.dto.project.QueryProjectRequest;
import com.automation.ui.dto.project.QueryProjectsResponse;
import com.automation.ui.dto.project.ProjectUpdateRequest;
import com.automation.ui.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projects")
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @GetMapping("")
    public QueryProjectsResponse query(QueryProjectRequest request, Pageable pageable) {
        return projectService.query(request, pageable);
    }
    @PostMapping("")
    public void create(@Validated @RequestBody ProjectCreateRequest request) {
        projectService.create(request);
    }

    @DeleteMapping("/{projectId}")
    public void delete(@PathVariable("projectId")Long projectId) {
        projectService.delete(projectId);
    }

    @PutMapping("/{projectId}")
    public void update(@PathVariable("projectId") Long projectId, @Validated @RequestBody ProjectUpdateRequest request) {
        projectService.update(projectId, request);
    }

    @PutMapping("/migration")
    public void migrate(ProjectMigrateRequest request) {

    }
}
