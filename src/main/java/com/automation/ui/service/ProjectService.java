package com.automation.ui.service;

import com.automation.ui.dto.project.ProjectCreateRequest;
import com.automation.ui.dto.project.ProjectMigrateRequest;
import com.automation.ui.dto.project.QueryProjectRequest;
import com.automation.ui.dto.project.QueryProjectsResponse;
import com.automation.ui.dto.project.ProjectUpdateRequest;
import org.springframework.data.domain.Pageable;

public interface ProjectService {
    QueryProjectsResponse query(QueryProjectRequest request, Pageable pageable);
    void create(ProjectCreateRequest request);
    void delete(Long projectId);
    void update(Long projectId, ProjectUpdateRequest request);

    void migrate(ProjectMigrateRequest request);
}
