package com.automation.ui.service;

import com.automation.ui.dto.project.CreateProjectRequest;
import com.automation.ui.dto.project.QueryProjectRequest;
import com.automation.ui.dto.project.QueryProjectsResponse;
import com.automation.ui.dto.project.UpdateProjectRequest;
import org.springframework.data.domain.Pageable;

public interface ProjectService {
    QueryProjectsResponse query(QueryProjectRequest request, Pageable pageable);
    void create(CreateProjectRequest request);
    void delete(Long projectId);
    void update(Long projectId, UpdateProjectRequest request);

}
